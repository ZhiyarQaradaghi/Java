package ITS350;
import java.util.Arrays;
public class Its350 {
    public static void main(String...args) {
        for (String string : args) {
            
        }
        int newArray[] = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.println(newArray[i]);
        }
        
        int newArrayTwo[] = {0,1,2,3,4}; 


    }    
    private int x;
    
}
/**  all objects of the same class have the same number of instance variables - an abstract class does not always need to have an abstract method 
-most of the time we use abstract class for inheritance but sometimes we use them for security purposes
-if we do not want other classes to extend the class like being a parent class for any class then we make it final class
-class variables (static variables), field - instance varaible, local variable
- any code outside of a code block cannot use a local variable inside the code block, no default values - instance have, 
- instance variables are located outside of all code blocks but inside the main class, they have default values, reccomended to use private access modifier but others can be used
- class variables are located like fields but have the keyword static, we call them through the name of class - classname.variable name

- insert, search, delete - are required for data structure and algorithms
*/