package ITE409.Inheritencechp8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // you can access getname setname getid setid getgpa setgpa
        // created an object with Student pointer data type, no polymorphism, the actual object is the actual pointer
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
        Student s = new Student() { // creating a new class on the fly, it will extend student, then im creating an object from it, using polymorphism so that the student pointer points at this object
            // 1st Creating a subclass of student
            // 2nd Creating an object from this sub class
            // 3rd Creating a pointer of student pointing at the object created in step 2
            // Whats the advantage?
            // If I created a subclass on the fly, it allows me to add/override any implementation of student on the fly
            @Override public int getId() {
                return input; // now getId will get the input from the scanner, without modifying the actual student class
            }
            // for 1 object, no matter what I throw at it, I will always get back 1000

        }; // If student was an interface, then we will be implementing the interface using that anonymous class instead of extending

        

        Student s2 = new Student();
        s.getId();
        s.setId(22);
        s.setName("Tahir");
        s.setGPA(2.5F);
       
        Person p = s;
        System.out.println(s.getId());
    }
    
}
