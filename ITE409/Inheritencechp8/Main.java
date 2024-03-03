package ITE409.Inheritencechp8;
import java.util.*;

import ITE409.Interface_chapter8.AUIS;

public class Main {
    public static void main(String[] args) {
        Student s2 = new Student(); // you can access getname setname getid setid getgpa setgpa
        System.out.println(s2.test());

        AUISMember s3 = new Student();
        System.out.println(s3.test());// STATIC methods cannot be overriden, this is the reason why static sucks - static methods is only depends on the pointer not the object itself
    }
    
}
