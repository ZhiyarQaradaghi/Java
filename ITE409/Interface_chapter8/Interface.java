package ITE409.Interface_chapter8;

public class Interface {
    public static void main(String[] args) {
        Faculty f1 = new Faculty(10);

        f1.setName("Ali");
        f1.setSalary(1500);

        Student s1 = new Student();
        s1.setName("Maya");

        // poly morphism - the pointers have 1 data type, actual object is different data type, this works because there is a relationship between student and person, every student will implement all the methods of a person
        Person p1 = new Student();
        p1.setName("Tahir");

       // this is same as above Person p1 = s1; // this pointer can point at any object can implement the Person interface
        // ^^ p1 will point at exactly the same memory address that s1 is pointing at
        // Person arg1 = s1;
        print(s1);
        // Person arg1 = f1;
        print(f1);

        // I can only use polymorphism  with classes that implement the interface, but if i add another method in the interface then
        // i need to also add that method to all the classes that implement that interface
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
