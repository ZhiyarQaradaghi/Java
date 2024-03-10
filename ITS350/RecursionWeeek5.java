package ITS350;

public class RecursionWeeek5 {
    public static void main(String[] args) {
        RecursionWeeek5 object = new RecursionWeeek5();

        object.towerOfHanon(3, 'A', 'B', 'C');
    }

    public static int trianglefind(int prev) {
        if (prev == 1) {
            return 1;
        } else {
            return prev + trianglefind(prev-1);
        }
        
    }

    public static void printStars(int star) {
        if (star == 1) {
            System.out.println("*");
            return;
        } else {
            System.out.print("*");
            printStars(star-1);
        }
    }

    public static String parenthisize(String s, int x) {
        if (x==0) {
            return s;
        } return '(' + parenthisize(s, x-1) + ')';
    }

    public static long factorial(int n) {
        long arr[] = new long[100000000];
        if (n==1) {
            return 1;
        } else {
            arr[n] = n*n-1;
            return factorial(n);
        }

    }

    public void towerOfHanon(int disk, char rodA, char rodB, char rodC) {
        if ( disk == 1) {
            System.out.println("Move disk "+disk+" From rod "+rodA+" to rod"+rodC);
        } else {
            towerOfHanon(disk-1, rodA, rodC, rodB);
            System.out.println("Move disk "+disk+" From rod "+rodA+" to rod"+rodC);
            towerOfHanon(disk-1, rodB, rodA, rodC);

        }
    }
}
