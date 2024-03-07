package SE421.Constructors;

public class Main {
    public static void main(String[] args) {
        Student s= new Student(); // if i create a constructor with id as parameter, then caller cannot call object without giving id : new Student(1);
        /**
         * This line is 3 operations
         * 
         * 1. Allocate memory for the object - Student
         * 2. Call the constructor - new Student()
         * 3. Create the pointer s
         *
         * You cannot have a class without constructor, always will call constructor
         * 
         * If you have a class without a constructor, then java will add default constructor for you : public [classname](){}
         * 
         * Constructor will be called once per execution of line
         */

         new Student();
         new Student(2); // CONSTRUCTOR OVERLOADING - java knows which constructor we are calling depending on the arguments passed
         new Student(3, "John");

         System.out.println(s.getId());
        
    }
}
