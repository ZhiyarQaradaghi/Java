package SE421.Week6;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(0);
        s1.setName("Sarah");
        
        print(s1.getId(), s1.getName()); // not your responsibility to extract, you could use the custom datatype Student
        // whenever you have a custom data type, use it as a datatype
        // pass by value

        print(s1); // just need s - object pointer
        // pass by reference

        // side effect of custom data type
        // 

        // which print is better??

        // imagine we do not have gpa, 2 days from now, we decided to add a gpa - how many changes do we need to do in order to implement gpa?
        // when you are using student as arg, you are passing all the responsibity of that student class as an argument
        // the caller of print does not require any modification, because the object pointer is enough to pass as a parameter (argument)
        // even if i had multiple more responsibilities, the signature doesnt change

        // Student s2 = new Student();
        // s2.setName(s1.getName());
        // s2.setId(s1.getId());
        // not practical, because if we have another variable then we have to enter it here as well - propagates

// do this 

        print(new Student(s1)); // i dont need to guess the name of the method / have a constructor in order to pass data by value if you deal with custom data type

        Student s2 = new Student();
        s2.copy(s1);
        print(s2);

        print(s1.duplicate()); // passing by value

        print(s1);

        System.out.println(s1.getName()); 

        // can we hack such that we pass custom data type is passing by value
        // #1 java wont allow it by default
        // can we make it so that when we print s.getName return Sarah no matter what print method resets



    }


    // big takeaway
    // if you have custom data types - use them
    // you are going to have extra variables/methods and you need to pass them without it propagating
    // side effect !! 


    // method 1
    // this still has problems, if you make changes in Student class it will propagate to this
    // move it to Student class
    public static void print(Student arg) { // i have 1 argument, it takes student
        // i will pass all the responsibilities student has as an argument
        System.out.println(arg.getId());
        System.out.println(arg.getName());
        System.out.println(arg.getGpa());

    }

    public static void print1(Student arg) {
        arg.print();
        arg.reset();
        // both caller and print are sharing the same memory location
        // you are passin gwhere the memory location is
        // if you reset it here, you will see that effect in the calller as well
    }
    // method 2
    public static void print(int id, String name) { // this is bad because if you add another parameter, like gpa, then you need to add another parameter, and write it again in the main call
        // this bad thing happens because of the way you treat student, because stu
        System.out.println(id);
        System.out.println(name);
    }
}
