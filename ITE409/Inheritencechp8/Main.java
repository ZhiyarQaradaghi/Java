package ITE409.Inheritencechp8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // you can access getname setname getid setid getgpa setgpa

        s.hashCode();
        System.out.println(s.hashCode()); 
        System.out.println(s.toString());

        Object o = new Student();
        o = new Scanner(System.in);
        o = System.out;

        Object[] arr = new Object[1000]; // games use this all the time - can hold any java object like scanner
    }
    
}
