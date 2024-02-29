package ITE409.Inheritencechp8&9;

public class Faculty extends AUISMember{ // now this class has inherited/has access to everything AUISMember has access to as long as it is not private
    private int salary;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
