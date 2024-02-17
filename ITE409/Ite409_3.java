package ITE409;
public class Ite409_3 {
    public static void main(String...args) { // args is an array, data type is a string, this allows you to provide arguments to the application before executing it
        for(String s: args) {
            System.out.println(s); // empty array until you provide arguments
        }

        int arr[] = new int[5]; // anytime you see [] then you are working with an array, limitation of java arrays is that every data type has to be the same and the size is fixed
        arr[0] = 20;
        arr[1] = 21;
        arr[2] = 22;
        arr[3] = 23;
        arr[4] = 24;
        /**you can declare array and assign values like this - int arr[] = {20, 21, 22}; */
        for(int x:arr){ // for each element get one element at one time put it in x and run the next iteration
            System.out.println(x);
        }
        /**for(int i = 0; i < arr.length; i++) {
            int x = arr[i]; // this only stores the values in the array into the x variable
            System.out.println(arr[i]);
        }*/

       /**  int x[] = new int[5]; 
        x[1] = 10; // declaring an array and a pointer named x 
        System.out.println(x[1]);
        int y[] = x; // create another pointer and point it exactly as the array x is pointing at

        y[1] = 20; // go to array 1 and throw away the previous value and add 20 instead, now the pointer x also has the value 20

        pointer of an array is a variable that points at a memory location and its a single value 

        System.out.println(x[1]);*/

        int x[] = new int[5];
        x[1] = 10;
        test(x); // passing by reference, change the array value at position 1 from 10 to 100 - passing by value means you are passing by actual value not memory location like x[1] position, passing by reference means you are passing the memory address of the value
        System.out.println(x[1]); // now the [1] position has a value of 100 
    }
    public static void test(int r[]) {
        System.out.println(r[1]); // print it initially its 10
        r[1] = 100; // then change 10 to 100
    }

    /** two ways to declare an array as an argument of a method 
     * first is above, you need ot construct the array, put values, pass the reference for that array
     * second:
     * java create an array, size of that array is 4 integers, once that is constructed put these values, then pass the reference of that array to the r variable
     * test(2,3,4,5);
     * public static void test(int...r)
     * 
     */
    
}
