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
        method1();
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
        String s = null;
        s.toString();
        // try { // execute this block of code, and if there is a problem then catch it -- the moment the exception ball is thrown then I will catch it
        //     s = null;
        //     System.out.println(s.toString());
        // }  catch(NullPointerException ex) {
        //     // if i have nullpointerexception, then this block will execute, if not then run the next block
        //     // having multiple catch is normal, for ex if database connection failed and multiple other stuff so you need multiple catch
        //     s = " ";
        //     System.out.println(s.toString());
        // }
        
        //     catch(RuntimeException ex) { // if you find this error, then catch it for me and give it to me then I will give a pointer to the object NullPointerException
        //     // the ex pointer helps us call the methods inherited by NullPointerException
        //     // if i change the catch to RuntimeException, then i can catch all exceptions that are runtime exceptions and any of its subclasses including NUllPOINTERexception
        //     // this is polymorphism as nullpointer exception is a subclass of runtimeexception and now you can catch all exceptions of runtime and its subclasses

            
        //     System.out.println("We have a problem");
        //     // System.out.println(ex.getMessage()); // print the exact message of the exception
        // } catch(Exception ex) { // will catch ALL errors in java, because exception is a super class of all exceptions
        //     s = "";
        // } finally { // a block of code that will execute no matter what, if there is exception or not -- doesnt matter
        //      System.out.println(s.toString());
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
