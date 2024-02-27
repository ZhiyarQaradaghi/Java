package ITE409.Interface_chapter8;

public class Interface {
    public static void main(String[] args) {
      Faculty f1 = new Faculty(); // <-- non polymorphic code
      Person f2 = new Faculty(); // <--- polymorphic code, the data type of the pointer is different from the data type of the actual object (memory space)
      //Person f3 = new Scanner(System.in); // trying to have an object with scanner and point it at interface person, but this wont work because there is no relationship between scanner class and interface
    
      // Anonymous class
      Person f3 = new Person() { // java on the fly, create a class, make this class implement person interface, then create an object from it and make f3 with data type person pointing at this object
        
        public String getName() {
            return "kaka hama";
        }
        public void setName(String s1) {

        }
      };

      f3.setName("John");
      System.out.println(f3.getName());

    }

    public static void print(Person arg1) {
        System.out.println(arg1.getName());
    } // I will allow any object that implements person interface, as long as this class implemented the person interface then i can pass that object

    /**public static void printFaculty(Faculty arg1) {
        System.out.println(arg1.getName());
    }

    public static void printStudent(Student arg1) {
        System.out.println(arg1.getName());
    }*/
}
