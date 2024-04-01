package ITS350.Binary;

public class BinarySearch {
    static int binarySearch(int key, int array[]) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start+end)/2;
        while(start<=end) {
            mid = (start+end)/2;
            if (key==array[mid]) {
                return mid;
            }
            if (key<array[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
            
        }

        return -1;
    }
    
    // using recursion
    static int binarySearch(int key, int array[], int start, int end) {
        if (start<=end) {
            int mid = (start+end)/2;
            if (key==array[mid]) {
                return mid;
            }
            if (key<array[mid]) {
                return binarySearch(key, array, start, mid-1);
            } else {
                return binarySearch(key, array, mid+1, end);
            }
            
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {3,6,7,8,10};
        int key =7;
        int index = binarySearch(key, list, 0, 4);
        if (index<0) {
            System.out.println(key+" is not present");
        } else {
            System.out.println(key+" is present at "+index);
        }
    }
}
