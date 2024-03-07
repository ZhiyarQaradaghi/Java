package ITE409.Exception;
// chapter 11
/**
 * Exception: An error that has been thrown in your project either by you or an api
 * 
 * How to introduce errors, how to catch and handle these errors. 
 * 
 * 2 types of error: Compile Time / Non-runtime: Error will occur during compilation -- Runtime error: The error will be thrown when application is running
 * 
 * Normal Exception: Can be declared and handled at compile time
 * Runtime compilation: Like runtime error
 * 
 * Not all errors can be detected at compile time, most cant
 * 
 * Every exception that you would like to create needs to be subclass of Runtimeexception
 * 
 * When you throw an exception, the execution will stop and the exception ball will keep being passed to all callers until someone catches it or if nothing catches it then it stops when reaches main
 * 
 */
public class Main {
    public static void main(String[] args) {
        Student s= new Student();
        
        s.setGpa(3);
        System.out.println(s.getGpa());

        // our exception will be thrown
        try {
            s.setGpa(-3); // if he tries to do this, then our original value will remain
        } catch (StudentException ex) {
            System.out.println(s.getGpa());
            
        }
        // s.setGpa(-2);
        // System.out.println(s.getGpa());


    }
}
