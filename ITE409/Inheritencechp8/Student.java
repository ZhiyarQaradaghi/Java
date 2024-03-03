package ITE409.Inheritencechp8;

public class Student extends AUISMember { 
    /**
     * The compiler will look at all the properties that are not private, is going to be inherited from the superclass
     * 
     * It is going to copy the student class
     * 
     * The private modifier is still in the object, but cannot be accessed by subclass - hidden from the subclass
     * 
     * You can avoid this by using get and set methods
     * 
     * 
     */

     

     private float gpa;
     public void setGPA(float gpa) {
        this.gpa = gpa;
     }

     public float getGPA() {
        return this.gpa;
     }

     public void print() {
        System.out.println(this.getName());
     }
     @Override // annotation, meta deta - help the compiler , but it is not required, asking compiler that i am overriding stuff not introducing a new method
     public String toString() { // this is called overriding, we are redefining the method in the sub class
        return "Student ID : " + getId() + " Name : " + getName() + " GPA : " + getGPA();
     }
     

     
    
}
