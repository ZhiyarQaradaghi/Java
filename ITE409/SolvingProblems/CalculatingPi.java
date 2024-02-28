package ITE409.SolvingProblems;

public class CalculatingPi {

    public static void main(String[] args) {
        
        float pi = 0;
        int terms = 1;
    
        int x = 1;
        float piarray[] = new float[200002];
        float pibookmark[] = new float[1];
       
        
        System.out.println("before computing : 4"+"\n");
        for (int i=0;i!=200001;i++) { 
            
                if (pi == 3.14159) {
                    
                    System.out.println("Needed : "+terms);
                }
                if (terms == 1) {
                    pi = 4;
                    
                }
                float nominator = 0;
                if (terms%2==0 && terms!=1) {
                    nominator = 4;
                     pi = pi - (nominator/x);
                     
                }
                if (terms%2==1 && terms!=1) {
                    nominator = 4;
                    pi = pi + (nominator/x);
                    
                }

                
           

            x = x + 2;
                
                piarray[i] = pi;
                terms++;
            
        }

        System.out.println("\nAfter computing : "+pi);
        
        
    }
    
    
}
