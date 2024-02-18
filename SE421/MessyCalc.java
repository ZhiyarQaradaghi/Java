package SE421;
import java.util.*;


public class MessyCalc {
    public static int x;
    public static int y;
    Scanner sc = new Scanner(System.in);
    public static void main(String...args) {
        
        MessyCalc obj = new MessyCalc();
        
        
        int arrget[] = obj.GetNumbers(x, y);
        
        System.out.println("The first number is = "+arrget[0]);
        System.err.println("The second number is = "+arrget[1]);
                
        int arr[] = new int[80];
        Addition(arr, arrget[0], arrget[1]);
        printAddition(arrget[0], arrget[1]);
        arr = new int[80];
        Multiplication(arr, arrget[0], arrget[1]);
        printMultiplication(arrget[0], arrget[1]);
        arr = new int[80];
        Subtraction(arr, arrget[0], arrget[1]);
        printSubtraction(arrget[0], arrget[1]);

    }

    public int[] GetNumbers(int x, int y) {
        int arrget[] = new int[2];
        System.out.println("Enter the first number = ");
        x = sc.nextInt();
        System.out.println("Enter the second number = ");
        y = sc.nextInt();
        arrget[0] = x;
        arrget[1] = y;
        return arrget;
    }
    



    public static void Addition(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 20; i++) {
            arr[index++] = x+y;
            
        }
    }

    public static void printAddition(int x, int y) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Addition : "+(x+y));
            
        }
    }

    public static void Multiplication(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            arr[index++] = x*y;
            
        }
    }

    public static void printMultiplication(int x, int y) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Multiplication : "+(x*y));
            
        }
    }


    public static void Subtraction(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 8; i++) {
            arr[index++] = x-y;
            
        }
    }

    public static void printSubtraction(int x, int y) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Subtraction : "+(x-y));
            
        }
    }




    

        
}
