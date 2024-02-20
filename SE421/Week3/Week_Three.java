package SE421.Week3;

// what is a class? Tool to organize blocks of code, Collection of methods
// Method : A code structure that allows you to name a block of code
// Class : Another code structure that has different properties, scope, attributes that makes it vastly unique compared to methods 
/**
 * Code --> base material
 * Method --> blocks
 * Class --> Wall
 * (different scopes)
 * 
 * RULE OF THUMB (ORGANIZED but not always) :
 * 
 * 1 file ---> 1 class
 * 
 * You can only have one class with the keyword public in a file
 * 
 * Create objects from a class
 */

 public class Week_Three {
    public static void main(String[] args) {
        /**Course.year = 2024;
        Course.name = "SE421";

        Course.year = 2020;
        Course.name = "ITE306";
        Course.print();*/



        Course s1 = new Course(); 
        // 2 operations, "new Course()" JVM asks OS to allocate enough memory where i can store one value of year and name
        //An object is a memory space, s1 is a pointer to the allocated memory space (object) - the pointer is needed to modify that memory space

        s1.year = 2024;
        s1.name = "SE421";

        Course s2 = new Course();
        s2.year = 2020;
        s2.name = "ITE306";

        s1.print();
        s2.print();
      // Course arg1 = s1; --- passing by reference
        test(s1);

      Course arr[] = new Course[100]; // all i did was create a data structure not object, created 100 pointers of type course
      
      for(int i=0;i<10;i++) {
         Course c;
         c = new Course();
         c.year = 1+2000;
         arr[i] = c;
      } 
      
      
      // you will lose this object after the loop if it is declared inside the loop
        
    }


    public static void test(Course arg1) {
      arg1.name = "";
      arg1.print();
    }
  }