package ITE409.Inheritencechp8;

public class Main {
    public static void main(String[] args) {
       /**  Student s = new Student();

        s.setName("Tahir");
        s.setGPA(2.5f);

        Person p = new Student();

        //p.setGPA(2.5f); // this will not work, generic pointers can only access generic members, ie members that are shared 

        p.getName();*/
        Person p = new Student();
        AUISMember a = new Student();
        Student s = new Student(); // you can access getname setname getid setid getgpa setgpa
    }
    
}
