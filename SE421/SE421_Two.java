package SE421;
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
        
        int arr[] = new int[70];
        int evenArray[] = new int[100];
      // if you pass by reference and call it | 2 | 4 | 6 | 8 | 98 |
      // best method - REMEMBER TO RESET THE ARRAY !!
        
        printEvenNumbers(arr);
        arr = new int[70];
      // Data will be corrupted  | 1 | 3 | ... | 98 |
        printOddNumbers(arr);
        arr = new int[70];
        printNumbersDivisibleBySix(arr);
        



    }
    // static int arr[] = new int[70]; easiest way but if this is production environment and you have 2 people at same time execute print odd and even and you want to add numbers to the array then you will corrupt the data
    public static void printEvenNumbers(int arr[]) { // this line is code structure, passing array into () and calling it in main method is the worst method 
        int index = 0;
        for(int i = 0;i<=100;i++) {
            if(i%2==0)
            arr[index++] = i;
            System.out.println("even number = "+i);
        }
    }

   /**  public static int findEvenNumbers(int[] evenArray) {

        for(int i = 0;i<=100;i++) {
            if(i%2==0)
            x[i] = i;
        }
    }*/

    public static void printOddNumbers(int arr[]) {
        int index = 0;
        for(int i = 0;i<=100;i++) {
            if(i%2!=0) // different ways: i%2==1 <-- slight confusing what is 1?, !i%2==0 <-- obscure but it will be better to use this when working with boolean operations
            arr[index++] = i;
            System.out.println("odd number = "+i);
        }
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
