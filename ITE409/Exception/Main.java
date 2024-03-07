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
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("New ball caught");
        }
        
        System.out.println("-------------");
        method3();
    }

    public static void method1() {
        System.out.println("method1 start");
        
        // NullPointerExeption -- it happens when you are using a pointer that is not pointing at an object
        // IndexOutOfBound Exeption -- happens when you go out of an array's length
        try { // catching exception from another method
            method2();
        } catch (NullPointerException ex) {
            System.out.println("Something went wrong");
        }
        System.out.println("method 1 end");
    }

    public static void method2() {

        System.out.println("method 2 start");
        
        throw new RuntimeException();// created an exception on the fly, throw the ball so somebody will catch it -- here method 2 throws it
        System.out.println("method 2 end");
        }
        
        

    


    // ASIACELL interview question : what is the output?

    public static void method3() {
        System.out.println("method 3 start");
        String s;
        try{
            s="";
            s.toString();
            return;
        } catch(NullPointerException ex) {
            s = "";
        } finally {
            System.out.println("finally");
        }
        System.out.println("method 3 end");
    }
}
