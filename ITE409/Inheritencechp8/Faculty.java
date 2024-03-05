package ITE409.Inheritencechp8;

public class Faculty extends AUISMember{ // now this class has inherited/has access to everything AUISMember has access to as long as it is not private
    private int salary;

    // public Faculty() {
    //     super(); // IF THE CONSTRUCTOR doesnt exist then you need to manually call it 
    // }

    // private Faculty() { // this means when making polymorphic AUISMember s = new Faculty(); wont work
    //                     // you cannot create objects from this class outside of faculty
    //                     // this allows you to limit the keyword new with certain classes
    //     super(0);
    // }

    // public static Faculty createInstance() {
    //     return new Faculty(); // by making it private, your constructor will never change
    // }
    public String getDept() {
        return "IT/SE";
    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getGPA());
    }
}
