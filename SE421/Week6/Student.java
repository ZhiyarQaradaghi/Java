package SE421.Week6;

class Dept{
    public String name;
}


public class Student {
    private int id;
    private String name;
    private int gpa;
    private Dept dept; // every student must have a department


    public int getGpa() {
        return gpa;
    }
    
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reset() {
        this.id = this.gpa = 0;
        this.name = null;
    }

    public void print() { // i have 1 argument, it takes student
        // i will pass all the responsibilities student has as an argument
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getGpa());

    }



    public Student() {

    }

    // will i also copy the dept or just student?
    // write a constructor such that it will truly copy everything, the Dept custom var type as well
    // if you put this.dept = arg.dept its not going to work
    // its not passing by value, if i change the dept name from the new copied student then it is going to propagate to old student

    public Student(Student arg) { // best and most elegant way
        this.setName(arg.getName());
        this.setId(arg.getId());
        this.gpa = arg.gpa;
        this.dept = arg.dept; // this is not passing by value, you are passing by reference and will be propagated back
        // why did we ignore String name??? 
        // whatever String name has, dept doesnt have it thats why -- what does it have?
        // its because of the way String is designed, can i make it so that dept is also designed that way?
        // this.year = arg.year;
    }

    public void copy(Student arg) {
        this.setName(arg.getName());
        this.setId(arg.getId());
        this.gpa = arg.gpa;
        // this.year = arg.year;
    }


    public Student duplicate() {
        Student s2 = new Student();
        s2.setName(this.getName());
        s2.setId(this.getId());    
        return s2; // copying each data from current objects to new object and returning the reference
    }

}
