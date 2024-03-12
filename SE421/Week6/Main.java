package SE421.Week6;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(0);
        s1.setName("Sarah");
        
        Student[] arr1 = new Student[100];
        for (int i = 0; i < arr1.length; i++) {
            Student s = new Student();
            s.setId(10000+i);
            arr1[i] = s; // multi dimentional array, holds multiple stuff (id, gpa ...)
            // if you use arrays normally then you need to create arr[][][][] or 4 arrays 
            // i want to give some other program this array by pass by value not reference - i dont want them to touch the array

        }

        Student[] arr2 = new Student[arr1.length];
        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = new Student(arr1[i]);// new object, copy whatever arr1 is pointing at
            // copied from arr1 into a seperate object, and arr2 points at it
        }

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
