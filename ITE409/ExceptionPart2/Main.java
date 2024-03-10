package ITE409.ExceptionPart2;

public class Main {
    public static void main(String[] args) throws StudentException { // i cannot handle it either so please let java vm handle it -- this is bad practice, you need to have a try and catch
        
         try {
            Student s = new Student();
            s.setGpa(5);
            setValues2(s);
            System.out.println("End main");
         } catch (Exception ex) { // you can catch all exceptions
            // throw error and save it in a file to see what the issue was
            // show to the user a GUI window error
            // segmentation fault in windows 98, nothing handeled it even the kernel so all you used to see is THE BLUE SCREEN WINDOWS
         }
        // s.setGpa(-3); // I will get an exception since it is negative and if condition is true, this exception will be at runtime 

        // if i change the student exception to be a sub class of exception rather than runtime exception, things will be different
        // Exception will make it so that the compiler asks 2 things before running the code, if you have a code throws a non runtime exception then you need to add a keyword
        // 1. "throws (exception)" this method whenever you call it, you need to deal with the exception -- no longer attached to runtime 
        // 2. use try and catch otherwise it wont compile

        // in runtime exception, you are not forcing the caller to surround the method with try and catch statement when they call it
        // I am forcing the caller to handle the error, as it will most likely occur -- adding try and catch at compile time

        // when do you use runtime exception and exception??
        // If you are in a situation where you are MOST LIKELY to get an exception, then use exception 


        // If you want to give flexiblity to the caller - use runtime
        // if you want to force the caller to handle it -- use exception

        /**
         * example 
         * 
         * class StudentException extends Extention {
         *  public StudentException() {
         *          super("msg"); // any way to do this without keyword super()? and anytime i call get message on this object, we are going to see gpa must be between 0 and 4
         * }
         * 
         * }
         * 
         * 
         * 
         * 
         * 
         */
            

        System.out.println("end main");


    }

    public static void setValues(Student s) {
        try {
            s.setGpa(-3);
        } catch (StudentException ex) {} // method 1


    }

    public static void setValues2(Student s) throws StudentException {// method 2 // i cannot handle this error, so throw it to the caller and he will handle it
        s.setGpa(3);
    }
}
