package ITE409;
public class Ite409_2 {

    static int x;
    public static void main(String...args) {
        int x = 100; // this value will only be applied for the scope of this method
        System.out.println(x);
        test(); // calling method
        test2(1);
        
    }
    
    public static void test() {
        System.out.println(x); // the value of x here is the default value
    }

    public static void test2(int a) {
        System.out.println(a); 
        a++;
    }
}
