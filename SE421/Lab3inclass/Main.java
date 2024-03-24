package SE421.Lab3inclass;

public class Main {
    public static void main(String[] args) {
        Addition a1 = new Addition(3,3);
        Operation s1 = new Subtraction(1,2);
        Operation m1 = new Multiplication(3,3);

        System.out.println(a1.compute());
        System.out.println(s1.compute());
        System.out.println(m1.compute());

        a1 = new Addition(a1, 3);
        a1 = new Addition(a1, 10);

        System.out.println(a1.compute());

        // 4


        Operation o3 = new Addition(new Multiplication(2,2), 4);

        System.out.println(o3.compute());

        // homework : solve in reverse order 1+(2*(5-4))

        // new stuff
        for (int i = 0; i < 10; i++) {
            Operation op1 = new Operation(){
                final int x = i;
                // this anonymous class implements Operation
                public double compute() {
                    return x;
                }
            };     
        }
       

        Operation op2 = new Addition(op1, 10);

        System.out.println(op2.compute());

    }    
}
