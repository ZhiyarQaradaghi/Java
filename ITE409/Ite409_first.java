package ITE409;
public class Ite409_first {
    public static void main(String...args) {
        GradeBook b1 = new GradeBook(); // three operations, 1- creating the object (allocating enough memory that is enough for all the variables in that object, 2. you are calling the constructor (calling the method thats why there are () - you are calling the constructor), 3. creating the pointer that points at the memory space)
        // constructors are special as they are called whenever you are creating an object ! 
        b1.courseId = 10;
        
        GradeBook b3 = new GradeBook(90); // calling constructor 2
        System.out.println(b1.courseGrade);
        b1.print();
       


        GradeBook b2 = new GradeBook();
        b2.courseId = 303;
        // Gradebook arg1 = b1
        adjust(b1); // passing by reference always the case with objects (modifying the memory space) -- passing by value is only for primitive data types
        b1.print(); // pointers are just references 
        b2.print();
    }
    public static void adjust(GradeBook arg1) {
        if(arg1.courseId < 100) {
            arg1.courseId = arg1.courseId + 100; // if the value is less than 100 then add 100 to it
        }
    }
    
}
