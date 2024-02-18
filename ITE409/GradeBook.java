package ITE409;
public class GradeBook {
    int courseId;
    int courseGrade; // the object is going to have the default value of that data type
    String courseName; // when you have a pointer that is null, you cannot use the pointer operator with it, you cannot access any objects that are pointing at null

    // A constructor is a method that will be called automatically when we are constructing/creating an object
    // requirement = name of the method should be identical to the class, should not return any data type without void return data type
    // you can have as many constructors, make sure arguments are different - advantage is to make the life of the calller easier
    // you can pass a int and a string as integer new GradeBook(90, "ITE303"); 
    // if you add void to the constructor or any access modifiers then it just becomes a method with the name of the class so you cannot pass values to it when creating an object 
    GradeBook() { // called whenever an object is created
        // how did you create objects without creating the constructor first? Java adds a default constructor - GradeBook() {} 
        /**courseGrade = -1;
        courseName = ""; */ 
        this(-1,""); // does same thing as ^^, just removing code duplication by using this - this keyword is used for constructors
        // this constructor will be called if you call the method without arguments 
    }
    // how can i call one constructor from another? ^^^
    GradeBook(int grade) {
        /**courseGrade = grade;
        courseName = "";*/
        this(grade,"");
        
    }

    // A special constructor for static variables -- static block, constructors are good for changing value of variables that are not static 
    // This constructor will be called once when the class is loaded to the memory
    // Type constructor is constructed with every construction of an object, static block will only be called once and its the first time you call the class
    static int year;
    static {
        year = 2024; // this value will go into the static year variable, you cannot assign non static variables in static blocks, static block is not used most of the time, static block is untestable because imagine trying to connect the database in a static block
        // you can just have if conditions in normal constructors and it will have the same function as static block

    }
    GradeBook(int grade, String name) {
        // HOME WORK 
        // READ ABOUT DESTRUCTORS - A METHOD THAT WILL BE CALLED AUTOMATICALLY WHEN THE OBJECT IS DESTROYED/DE-ALLOCATED FROM THE MEMORY
        courseGrade = grade;
        courseName = name;
        
    } // if there is a constructor already, java will not create a default constructor !! 
    public void print() {
        System.out.println("the course id is equal to"+courseId);
    }


}
