import java.util.Arrays;

public class Prac1 {
    public static void main(String...args) {
        

        int arr[] = {1,2,3}; 
        int result = findSmallest(1, 2, 3);
        
        System.out.println("Smallest number among 3 integers is : "+result);

        findOdd(arr);
        search(arr);
        deletion(arr);
        int b[];
        b = arr.clone();
        for (int x : b) {
            System.out.println(x);
        }
        
    }

    public static int findSmallest(int x, int y, int z) {
        int min = x;

        if(min > y)
        min = y;
        if(min > z)
        min = z;
        return min;

    }

    public static void findOdd(int arr[]) {
        for(int i =0;i<3;i++) {
            
            if (arr[i]%2 == 1) {
                System.out.println("This number is odd : "+arr[i]);
            }
        }
    }

    public static void search(int arr[]) {
        for(int i = 0; i<3;i++) {
            if (arr[i] == 2)
            System.err.println("Key is found");
        }
    }

    public static void deletion(int arr[]) {
        for(int i=0;i<3;i++) {
            if (arr[i] == 3) {
            arr[i] = arr.length - 1;
            System.out.println("Elements have been shifted and length has been reduced to : "+arr.length);
            }
        }
    }
    
}
