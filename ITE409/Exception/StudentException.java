package ITE409.Exception;

public class StudentException extends RuntimeException {
    public StudentException () {
        super("The GPA must be between 0 and 4"); // we made our own custom error/exception
    }
}
