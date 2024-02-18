package SE421;
import java.util.*;

public class MessyCalc {
    
    static Scanner sc = new Scanner(System.in);
    private static int x;
    private static int y;

    public static void main(String... args) {
        
        MessyCalc obj = new MessyCalc(0, 0);
        obj.enterNumbers();

        int[] arrget = obj.getBothNumbers(x, y);

        System.out.println("The first number is = " + arrget[0]);
        System.out.println("The second number is = " + arrget[1]);

        String operationCases = SelectingAnOperation.selectOperation();
        Operations operations = new Operations();
        switch (operationCases) {

            case "addition":
                operations.performAddition(arrget[0], arrget[1]);
                break;
                
            case "multiplication":
                operations.performMultiplication(arrget[0], arrget[1]);
                break;

            case "subtraction":
                operations.performSubtraction(arrget[0], arrget[1]);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }

    public void enterNumbers() {
        System.out.println("Enter the first number = ");
        x = sc.nextInt();
        System.out.println("Enter the second number = ");
        y = sc.nextInt();
    }

    public int[] getBothNumbers(int x, int y) {
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public boolean setFirstNumber(int z) {
        this.x = z;
        return true;
    }

    public boolean setSecondNumber(int v) {
        this.y = v;
        return true;
    }

    public MessyCalc(int x, int y) {
        setFirstNumber(x);
        setSecondNumber(y);
    }
}

class Operations { 

    private Addition addition;
    private Multiplication multiplication;
    private Subtraction subtraction;

    public Operations() {
        
        addition = new Addition();
        multiplication = new Multiplication();
        subtraction = new Subtraction();

    }

    public void performAddition(int x, int y) {
        addition.addingTwoNumbers(x, y);

        addition.printAddition(x, y);
    }

    public void performMultiplication(int x, int y) {
        multiplication.productOfTwoNumbers(x, y);

        multiplication.printMultiplication(x, y);
    }

    public void performSubtraction(int x, int y) {
        subtraction.subtraction(x, y);

        subtraction.printSubtraction(x, y);
    }
}

class Addition {

    public void addingTwoNumbers(int x, int y){}

    public void printAddition(int x, int y) {
        System.out.println("The sum of both numbers is = " +(x+y));
    }
}

class Multiplication {
    
    public void productOfTwoNumbers(int x, int y){}

    public void printMultiplication(int x, int y) {
        System.out.println("The product of both numbers is  = "+(x*y));
    }
}

class Subtraction {

    public void subtraction(int x, int y){}

    public void printSubtraction(int x, int y) {
        System.out.println("The difference of both numbers is = "+(x-y));
    }
}

class SelectingAnOperation {

    public static String selectOperation() {

        System.out.println("Choose an operation = ");
        System.out.println("1- Addition");
        System.out.println("2- Multiplication");
        System.out.println("3- Subtraction");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return "addition";
            case 2:
                return "multiplication";
            case 3:
                return "subtraction";
            default:
                return null;
        }
    }
}
