package ITE409.Databases;

// jdbc - java database connectivity - database API for java | jpa - built on top of jdbc

// we will build our own version of workbench to talk to the database
// what is a database? 
// database offers indexing with the performing of O(logn)
// dbms: MS Access, MS Sql server, MySQL, Oracle
// Java --> JDBC --> database products: MySQL, Oracle ... 
//      | jvm    | to connect your app to the databse, you need a TCP/IP connection
// you can replace Java with workbench, it works the same
// tcp ports: 3306, 3308
// IP : 127.0.0.1/localhost
// SQL Statement goes to database, database will resolve it, then sends it back to the app through the tcp connection

/*
 * SQL H.W.
 * --- first | last | salary | depid
 * Write an SQL statement to print the first name of the employee with the 2nd highest salary
 * 
 * SELECT first, MAX(salary)  
 * FROM employees
 * WHERE first LIKE '%a' -- starts with letter a 
 * 
 */
import java.lang.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(Globals.db_uri, Globals.db_username, Globals.db_pass)){  // has a static method called getConnection -- allows you to create ocnnection
                    
            Statement statement = conn.createStatement(); // statement represents one SQL STATEMENT
            Scanner scanner = new Scanner(System.in);
            
            // System.out.println("| Inserting data for student table |");
            // System.out.println("Enter the ID");
            // int id = scanner.nextInt();
            // scanner.next();
            // System.out.println("Enter the first name");
            // String firstname = scanner.nextLine();
            // scanner.next();
            
            // System.out.println("Enter the last name");
            // String lastname = scanner.nextLine();
            // System.out.println("Enter the age");
            // int age = scanner.nextInt();
            int id = 5;
            String firstname = "Maya";
            String lastname = "Tahir";
            int age = 21;

            // id 5, firstname maya, lastname tahir, age 21 year
            String q = "INSERT INTO Students(id, firstname, lastname, age) VALUES("+id+", '"+firstname+"','"+lastname+"',"+age+")";
            String w = "SELECT * FROM students";
            // System.out.println(q);
            
            // dont allow user to add : OR 1=1 -- sql injection attack
            ResultSet rs = statement.executeQuery(w); // Result set is a built in data structure in jdbc
            while(rs.next()) { // Result set will only look at the query result and not the actual data
                int i = rs.getInt("id");
                String f = rs.getString("firstname");
                String l = rs.getString("lastname");
                int a = rs.getInt("age");
                System.out.println(i+"------"+f+"------"+l+"------"+a);
            }
            // int result = statement.executeUpdate(q);
            // System.out.println("Rows effected : "+result);

        }catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}

class Globals {
    public static final String db_uri = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC"; // indicates whats the ip address, port number, and the database name
    public static final String db_username = "root"; // change according to your sql server
    public static final String db_pass = "1234"; // change according to your sql server
}
