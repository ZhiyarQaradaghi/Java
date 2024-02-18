package ITE409; 


public class Ite409 {
    public static void main(String...args) {
        GradeBook b1 = new GradeBook(50);
       /** b1.courseGrade = 90;
        System.out.println(b1.courseGrade);
        b1.print(); // we can access a private variable if it is in a public method and you call the method
        */
        b1.setGrade(-90); // they can indirectly change the variable data
        //b1.courseGrade = -110; // imagine an idiot put a negative number that isnt logical, so how can i deal with this? I will design my classes in such a way that my numbers start from 0 and max is 100 using access modifiers
        // key problem is you are exposing this variable so make courseGrade private but now all values are not valid, so create 2 methods, one for retrieving data
        System.out.println(b1.getGrade()); // now they can call the method instead of the variable itself

        


    }
    
}
