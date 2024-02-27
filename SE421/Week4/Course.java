package SE421.Week4;

import java.io.PrintStream;

public class Course {
    //this.dept = new Dept(); // pointer to an object Dept
    int year;
    String name;
    Dept dept;
    
    

    public void setValues(int year, String name, String deptName) {
        this.year = year; // overshadowing 
        this.name = name;
        this.dept = new Dept();
        this.dept.deptName = deptName;
        
    }

    void print() {
        // Classname.variable <--- static variable inside System class
            System.out.println("Year : "+this.year+" Name : "+this.name);
            
        }
}
