package ITE409.Inheritencechp8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Student s1 = new Student(); // you can access getname setname getid setid getgpa setgpa
        AUISMember f1 = new Faculty();
        Faculty f2 = new Faculty(); // whats the key difference? If you have a method and its declared in faculty only then
        // then polymorphic code wont see it

        //System.out.println(f1.getDept()); // the moment a method implements an abstract method then it wont take another
        System.out.println(f2.getDept());
    }
    
}
