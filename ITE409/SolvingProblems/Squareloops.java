package ITE409.SolvingProblems;

public class Squareloops {

    
    public static void main(String[] args) {
        
        // beginner way
        int x = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(x+"");
        }
        System.out.println();
        x++;

        for (int i = 0; i < 5; i++) {
            System.out.print(x+"");
        }
        System.out.println();
        x++;

        for (int i = 0; i < 5; i++) {
            System.out.print(x+"");
        }
        System.out.println();
        x++;

        for (int i = 0; i < 5; i++) {
            System.out.print(x+"");
        }
        System.out.println();

        x++;

        for (int i = 0; i < 5; i++) {
            System.out.print(x+"");
        }
        System.out.println("\n");



        // USE NESTED LOOP
        x = 1;
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print(x+"");
            }
            x++;
            System.out.println();
        }

        

    }
}
