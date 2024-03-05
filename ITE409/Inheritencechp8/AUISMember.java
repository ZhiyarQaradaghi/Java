package ITE409.Inheritencechp8;

import java.util.Scanner;


public abstract class AUISMember extends Person { // final when attached to class means this class should not have sub classes / no inheritence 
    // this is good for security reasons as other sub classes will not access its contents --> when used for class
    // ABSTRACT means that this class is not finished, but my child classes will finish the implementation



    // WHAT HAPPENS if the class is abstract but there is no abstract methods
    // I have a class called AUISMember but this class is not complete
    // if you try to create AUISMember f3 = new AUISMember(); then it wont work
    // this is because it is incomplete, you CANNOT USE THE KEYWORD NEW
    // But you can use a subclass to use the keyword new with the AUISMember
    /**
     * 
     * Scanner sc = new Scanner(System.in); What is the class of the variable in?
     * 
     * The class InputStream containing in is an abstract class, it is an incomplete class with abstract method read()
     * 
     * 
     */
    
    private int Oldid; // sub classes cannot see this
    protected int id; // acts like private for everyone, and acts like public for you and all your subclasses
    // protected is only used when dealing with inheritence 

    // public AUISMember() { this works if id has keyword FINAL
    //     Scanner sc = new Scanner(System.in);
    //     id = sc.nextInt();
    // }
    // public AUISMember() {
       
    //     System.out.println("Super Constructor1");
    // }

    // public AUISMember(int a) {
    //     System.out.println("Super Constructor2");
    //     setId(a);
    // }

    // public abstract String getDept(); // I have a method called getDept its going to return string but 
    // I dont know what the implementation is but my subclasses will provide it


    public void setId (final int id) { // why do we have final in the argument declaration?
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    // public final int getId() { // create a new method called getId, the keyword final indicates that this method cannot be overriden by subclasses NO @OVERIDING!!- implementation is FIXED
    //     return this.id;        // If you have a method that if somebody overrided as subclass and it breaks the entire system then you use this, most of the time you dont want to do this though
    // }
    
}
