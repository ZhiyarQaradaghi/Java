
package SE421;
import java.util.*;

public class SE421_Two {
    public static void main(String[] args) {
        // when you make a mistake, it is going to be so small and you wont realise it is feeding the complexity beast 
        // Once you are in the complexity flags(3) then you need to do Code Refractoring -- the problem with it is time and resources (throwing alot of components in codebase that was made with alot of time)
        // how can we eliminate code complexity? - SE were made to solve this
        // We can create Code Structures that have nothing to do with business requrements but it is there to create a structure for me that allows me to reduce or eliminate complexity as much as possible for that given situation
        // When you want to create structures then ou have to write code on top of that code you already have
        // These strategies can be applied regardless of system requirements
        // when you look at a code, ask yourself if it is code structure or business logic???
        // HOME WORK :  TRY TO SPLIT THE CODE AGAIN SUCH THAT YOU HAVE 5 METHODS -- MAKE SURE YOU USE ARRAY TO COLLECT NUMBERS
        // More code structure added to system == slower application -- called Over-Engineering which is as bad as Under-Engineering because writing code takes time and performance hits 
        // Lab 1 part 2 == MAKE IT OVER ENGINEERED 
        
        //int arr[] = new int[70];
        
      // if you pass by reference and call it | 2 | 4 | 6 | 8 | 98 |
      // best method - REMEMBER TO RESET THE ARRAY !!

        int[] r = collectRange();
        int start = r[0];
        int end = r[1];

        // solution 3
        
        findEvens(start,end); //passing by ref, caller doesnt have to remember 
        findOddNumbers(); // as long as that index pointer is pointing at it, then java will not delete the data structure


        // solution 2 
        int arr[] = new int[70];

        // in which situation are you going to prefer 2 over 3?
        // solution 2 is more memory efficient, if you dont have alot of memory then solution 3 is bad
        // if iam dealing with a language with no memory management like C, solution 3 is bad

        // solution 3 is best for our example


       /**  printEvenNumbers(arr);
        arr = new int[70];
      // Data will be corrupted  | 1 | 3 | ... | 98 |
        printOddNumbers(arr);
        arr = new int[70];
        printNumbersDivisibleBySix(arr);*/
        



    }

    public static int[] collectRange() {
        int result[] = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the range");
        result[0] = scanner.nextInt();
        System.out.println("Enter the end of the range");
        result[1] = scanner.nextInt();
        
        return result;

    }
    // static int arr[] = new int[70]; easiest way but if this is production environment and you have 2 people at same time execute print odd and even and you want to add numbers to the array then you will corrupt the data
    public static int[] findEvens(int start, int end) { // this line is code structure, passing array into () and calling it in main method is the worst method 
        //my methods are shallow!
        // my methods are deep
        //1 functional req -- > 1 method
        // if you can split that code then split it
        
        /**int [] r = collectRange(); // it is valid at run time s you cannot run this find even without invoking the collect range for the scanner, 2 methods are chained together, becareful with where you call it
        int start = r[0];
        int end = r[1];*/

        int arr[] = new int[end];
        int index = 0;

        for(int i = start;i<=end+1;i++) {
            if(i%2==0)
            arr[index++] = i;
            System.out.println("even number = "+i);
        }
        // returning the reference
        
        return arr;
    }

   /**  public static int findEvenNumbers(int[] evenArray) {

        for(int i = 0;i<=100;i++) {
            if(i%2==0)
            x[i] = i;
        }
    }*/


    public static int[] findOddNumbers() {

        
        int [] r = collectRange();
        int start = r[0];
        int end = r[1];

        int arr[] = new int[end];
        int index = 0;

        for(int i = start;i<=end+1;i++) {
            if(i%2!=0) // different ways: i%2==1 <-- slight confusing what is 1?, !i%2==0 <-- obscure but it will be better to use this when working with boolean operations
            arr[index++] = i;
            System.out.println("odd number = "+i);
        }
        
        return arr;
        
    }

    public static void printNumbersDivisibleBySix(int arr[]) {
        int index = 0;
        for(int i = 100;i<=200;i++) {
            if(i%6==0)
            arr[index++] = i;
            System.out.println("divisible by 6 and between 100 and 200 = "+i);
        }
        

    }
}
