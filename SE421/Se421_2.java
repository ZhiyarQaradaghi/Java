package SE421;
public class Se421_2 {
    public static void main(String...args) {
        
       // x = y = 10; //execution is from right to left
       for(int i=0;i<10;i++) {
            if (i%2==1) {
                break; //break the loop if the number is odd, continue means skip the current iteration
            }
            System.out.println();
       }
       int arr[] = new int[5];
       System.out.println(arr[0]);
       arr[0] = 1;
       int z[] = arr;
       
       System.out.println(z[0]);

       int x[] = new int[5];
       x[1] = 100;

       test(x);System.out.println(x[1]);

    }

    public static void test(int[] y) 
    {
        y[1] = 50;
        System.out.println(y[1]);
    }
    
}
