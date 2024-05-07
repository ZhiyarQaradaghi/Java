package ITE409.GUI.JTablesWeek10;

import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.*;

public class Main {
    public static void main(String[] args) {
        // ALL code related to GUI should run under a different thread / a different branch
        SwingUtilities.invokeLater(() -> {
            JFrame jf = new TableExample();  // i give the code to swing api, swing will execute it under its own thread
        });

        // same code as above 
        // SwingUtilities.invokeLater(new Runnable() {
        //     @Override
        //     public void run() {
        //         JFrame jf = new TableExample(); 
        //     }
        // });
    }
}

//GUI should not be in the same package in real life - MCV architecture

class TableExample extends JFrame {
    private JTable table;
    public TableExample() {
        initComponent();
    }

    private void initComponent() {
        // String[] columns = new String[] {
        //     "ID","Name","GPA","IT/SE"
        // };

        // Object[][] data = new Object[][]{
        //     {1, "Ahmed", "3.2", true},
        //     {2, "Tahir", "2.2", true},
        //     {3, "May", "1.2", true},
        // };

        
        // make a factory design pattern for connection - one class for connection and a factory class for it and ask the factory to give the connections out  - reuse connection
        try (Connection conn = DriverManager.getConnection(Globals.db_uri, Globals.db_username, Globals.db_pass)){
            // put limit
            String query = "SELECT * FROM students LIMIT 100;";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            DefaultTableModel model = new DefaultTableModel();
            table = new JTable(model);
            
        // removing current data
        while (table.getRowCount() > 0) {
            model.removeRow(0); // it will continuously remove the first row until the model is empty
            ((DefaultTableModel)table.getModel()).removeRow(0);
        }

        // inserting rows to model
        while (rs.next()) { // next is a pointer that goes throw each row in the jdbc table
            Object[] row = new Object[2];
            for (int i = 1; i < row.length; i++) {
                row[i-1] = rs.getObject(i); // all data will be encapsulated in one data structure by the end of this loop
            }

            ((DefaultTableModel)table.getModel()).insertRow(rs.getRow() -1, row);
        }
        
        } catch (Exception e) {
            // TODO: handle exception
        }


        // HOMEWORK - combine this with JDBC 

        // DefaultTableModel model = new DefaultTableModel(data,columns){
            //     @Override
            //     public boolean isCellEditable(int row, int collumn) {
                //         if (collumn>2) {
                    //             return true;
        //         }
        //         return false;
        //     }

        //     private Class[] collumnsTypes = new Class[] {
        //         Integer.class, String.class, Double.class, Boolean.class
        //     };
        //     // @Override
        //     // public Class<?> getCollumnClass(int collumn) {
        //     //     return collumnsTypes[collumn];
        //     // }
        // };

        // JTable jt = new JTable(model);
        // this.add(new JScrollPane(jt));
        // this.setTitle("Table Example");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack(); // adjusts the frame size according to pixel count 
        this.setSize(800,800);
        this.setVisible(true);
        
    }
}

class Globals {
    public static final String db_uri = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC"; // indicates whats the ip address, port number, and the database name
    public static final String db_username = "root"; // change according to your sql server
    public static final String db_pass = "1234"; // change according to your sql server
}
