package ITE409.ExceptionPart2;

import ITE409.Exception.Student;

public class StudentException extends Exception {
    private String myMsg = "The GPA must be between 0 and 4";
    public StudentException() {
        //super("GPA MUST BE BETWEEN 0 AND 4"); this is bad, because when the caller is using an object of type student, he call the message with ex.getMyMsg
        
    }

    @Override
    public String getMessage() { // if i name the methods anything else that is different from the get method from my super class then there is no overriding
                                // there exists a getMessage() method in the super class
        return myMsg;
    }
}
