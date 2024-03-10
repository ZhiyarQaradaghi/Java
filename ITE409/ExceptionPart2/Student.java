package ITE409.ExceptionPart2;

public class Student {
    private int id;
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public void setGpa(double gpa) throws StudentException { // we are going to create an exception if this gpa is negative or grater than 4
        // if (gpa < 0 || gpa > 4) {
        //     throw new StudentException(); // created a custom exception on the fly, will be triggered according to the condition 
        //     // attach any object and give it to throw as long as it is a subclass of exception class
        //     /**
        //      * Two main classes for exception : Exception extends Throwable and its sub class is Runtime Exception --> has subclasses 
        //      * 
        //      * 
        //      * Runtime exceptions represent the errors that happen at runtime/on the fly
        //      * 
        //      * Exceptions also has runtime exceptions but also has more restriction, compiler forces certain rules before the code is compiled
        //      */
        // }

        if (gpa<0) {
            throw new StudentException() {
                @Override
                public String getMessage() {
                    return "The GPA is negative";
                }
            };
        }
        if (gpa > 4) {
            throw new StudentException() {
                @Override
                public String getMessage() {
                    return "This GPA must be less than 4";
                }
            };
        }
        this.gpa = gpa; // this line will never run if the exception is thrown, so our gpa will not updated its value to a wrong value
    }

    public void setId(int id) {
        this.id = id;
    }

}
