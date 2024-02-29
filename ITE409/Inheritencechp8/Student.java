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

     public void print() {
        System.out.println(this.getName());
     }

     private float gpa;
     public void setGPA(float gpa) {
        this.gpa = gpa;
     }

     public float getGPA() {
        return this.gpa;
     }
    
}
