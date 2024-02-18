package ITE409;
public class GradeBook {
    private int courseGrade;
    private static int year = 2024; // Hiding --> Abstract / Trying to abstract pieces from the system / Encapsulate and Abstraction
    String courseName; // whenever you have variables, always make these variables PRIVATE and have get and set methods 
    // you can change the variable name freely without affecting the other methods and classes that use it


    // we will talk about access modifiers week 3 #1
    // an attribute you will give to a class,method,variable to control access to it 
    // 4 types of access modifiers : 1- Public, 2- Private, 3- Protected, 4- Default
    /** Academia POV - everything is important / Industry POV : Public and Private are most important, default useless, avoid using Protected unless design issue -- many programming language removed those 2
     * Public - builtin java keyword
     * Private - builtin java keyword / complete opposite of public / noone can access that given member except me!
     * Protected - builtin ....
     * Default - anyone who are in the current package can access the class
     */

    

    // have a constructor to force people to enter a grade
    public GradeBook(int courseGrade) {
        setGrade(courseGrade); // call the method instead of modifying the coursegrade directly
    }


     // reading the value of course gradebook, instead of calling the variable itself now they can call the method
     // traditionally the name starts with get for reading 
    public int getGrade() {
        return courseGrade;
    }

    public void setGrade(int g) {
        if(g>=0 && g<=100) {
            this.courseGrade = g; // why put this here? its a good habit and wont make a difference, but this means just the current object, imagine if we have an argument that has the same exact name as the variable grade
        }else{
            System.err.println("The grade should be between 0 and 100");
        }
        
    }


    public void print() {
        System.out.println(this.year); // just always put this. to avoid problems like same arguments, its called variable over shadowing, where you want to use the instance variable instead of the arguments in the method
        System.out.println(this.courseGrade);
    }

}
