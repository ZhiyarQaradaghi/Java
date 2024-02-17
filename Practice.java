public class Practice {
    public static void main(String...args) {
        System.out.println("Let us practice Java");
        calc(1,1);
    }

    public static int calc(int x, int y) {
        int z = x + y;
        for(int i = 0; i < 10; i++) {
            System.out.println(z);
            
        }
        

        return z;
    }
}