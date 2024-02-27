package ITE409.Interface_chapter8;

public class Student implements Person { // the student will implement every single method in the interface declared in a person, you can have more than one interface attached to a class
    private String studentName;
    public String getName() {
        return studentName;
    }
    // all the classes that implements the interface
    public void setName(String name) {
        studentName = name;
    }

    public void print() {
        System.out.println("Student name "+studentName);
    }
}
