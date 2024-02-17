package SE421;

public class TEST2 {
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

    public static void RemoveDuplicate(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (!(arr2[arr[i]])) {
                System.err.println(arr[i]);
                arr2[arr[i]] = true;
            }

            System.out.println(arr2[arr[i]]);
        }
    }
}
