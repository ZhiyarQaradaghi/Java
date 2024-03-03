package ITE409.Inheritencechp8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // you can access getname setname getid setid getgpa setgpa
        s.setId(22);
        s.setName("Tahir");
        s.setGPA(2.5F);
       
        Person p = s;
        System.out.println(p.toString()); // you can inherit stuff and rewrite the code for what you inherited
        System.out.println(p); // passing the object itself rather than converting to string, you will get the same result as above 
        System.out.println(s); // this is because we overrided the string methods
    }
    
}
