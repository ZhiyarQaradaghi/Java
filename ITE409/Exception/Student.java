package ITE409.Exception;

public class Student {
    private int id;
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public void setGpa(double gpa) { // we are going to create an exception if this gpa is negative or grater than 4
        if (gpa < 0 || gpa > 4) {
            throw new StudentException(); // created a custom exception on the fly, will be triggered according to the condition 
        }
        this.gpa = gpa; // this line will never run if the exception is thrown, so our gpa will not updated its value to a wrong value
    }

    public void setId(int id) {
        this.id = id;
    }

}
