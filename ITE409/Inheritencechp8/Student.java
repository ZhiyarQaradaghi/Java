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

   //   public Student() {
   //       //super(10); // working with constructor in the SUPER class
   //       // One of the constructor of the super class will always be called when you are creating object from sub class
   //       // java will create Student(){super();}
   //      // working with constructor in this class this(10); 
   //       // KEYWORD SUPER MUST BE THE FIRST LINE
   //      setGPA(gpa);
   //   }

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

     @Override
     public int getId() {
      return -1;
     }

     public static String test() {
      return "From Student Class";
     }

     public String getDept() {
      return "ENG";
     }

     @Override
     public void setId(int i) { // removing the implementation of this method by overriding
      // overriding is used to change or throw away implementation

     }
     @Override // annotation, meta deta - help the compiler , but it is not required, asking compiler that i am overriding stuff not introducing a new method
     public String toString() { // this is called overriding, we are redefining the method in the sub class
        return super.toString() + "Student ID : " + getId() + " Name : " + getName() + " GPA : " + getGPA();
     }        // call implementation of parent for this method - super

     /**public String toString() { // this is called overriding, we are redefining the method in the sub class
      return super.toString() + "STD"; // dont look at my class, look at my parent and call their implementation of their code
   }*/
   
     

     
    
}
