import java.util.Scanner;

public class MessyCalc {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int x = sc.nextInt();
        System.out.println("Enter the second integer");
        int y = sc.nextInt();

        int arr[] = new int[80];
        Addition(arr, x, y);
        arr = new int[80];
        Multiplication(arr, x, y);
        arr = new int[80];
        Subtraction(arr, x, y);
        System.out.println(arr[7]);

    }

    public static void Addition(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 20; i++) {
            arr[index++] = x+y;
            System.out.println("Addition : "+(x+y));
        }
    }

    public static void Multiplication(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            arr[index++] = x*y;
            System.out.println("Multiplication : "+(x*y));
        }
    }

    public static void Subtraction(int arr[], int x, int y) {
        int index = 0;
        for (int i = 0; i < 8; i++) {
            arr[index++] = x-y;
            System.out.println("Subtraction : "+(x-y));
        }
    }

    

        
}
