package SE421;
import java.util.*;

public class TEST {
    public static void main(String...args) {
        int arr[] = new int[100];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 4;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 7;
        arr[9] = 7;
        arr[10] = 12;
        arr[11] = 12;
        arr[12] = 13;
        arr[13] = 15;
        arr[14] = 16;
        RemoveDuplicate(arr);
    }
    static int index = 0;
    static int index2 = 1;
    static int n = 0;
    public static void RemoveDuplicate(int arr[]) {
        for (int i = 0; i < arr.length && index < arr.length && index2 < arr.length; i++) {
            
            if (arr[index2] == arr[index]) {
                arr[i] = n;    
            }
            index++;
            index2++;
            if(arr[i] == n) {
                System.out.println(arr[i]);
            }
            System.err.println(arr[i]);

        }
    }
}
