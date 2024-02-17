package ITE409;
/**  Java recap
// every method has to be in a class
// execute two commands for compiler, javac ./It409.java 
// java will rewrite your application as byte code, you cannot read byte code files - after this step the ide will run the command java to start up the java vm which will look at your system specs and translate byte code to machine code 
// machine code will be different on a mac os compared to a windows 
// compile it once and run it everywhere
// *** topic - some languages will go from compiler and immediately into machine code - making the application slightly faster
a static method can only be with a static method
curly brackets are used to set a scope, any variables declared in a scope will stay in that scope (local variables)
*/

public class Ite409 { 
    public static void main(String...args) /** you can write the square bracket in the main method as ... or []*/ { 
        int x = 10;
        int y = 5;
        System.out.println(print(x)); // whenever you see  () then you are dealing with a method, when you have a method without {} hat means you are callng a method, but if it is with {} means you are declaring a method
        System.out.println(calc(x,y));
        //x; if there is a symbol but no () right after that means it is a variable 
        //x();  this is dealing with a method 
        // there are 2 variables so far - system . out -- out is a variable 
        // there is a class called system and there is a variable called out and a method named println - giving 3 instructions to java
        // sometimes you wont get the intended the resut, just stop the application and run it again
    }   

        public static int print(int value){ // void means this method does not return a value to the one who calls 
            System.out.println(value);
            return value*20; // whenever you return a value the code will immediately go back to the method caller so if you put it in a loop it will cancel it - can only be returned once
        }
        // continue means skip the loop
        // break means stop the entire loop
        public static int calc(int x, int y) {
            int z = x + y;
            int i = 0;
            /**while (i < 10 || 1==1) {
                System.out.println(i);
                i = i*10;
            }*/
            return z;
        }
}
