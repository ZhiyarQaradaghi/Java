package ITE409.Interface_chapter8;

public class Interface {
    public static void main(String[] args) {
       /**  Faculty[] arr1 = new Faculty[100]; // create a new faculty object, then point at that faculty object
        for (int i = 0; i < 100; i++) {
            if(i<9) {
                arr1[i] = new Faculty(i);

             }else{ 
                arr1[i] = new Student();
            }
        }*/
            // you can only access the coe that is shared between the interface and the class
        Person test = new Person() {
            public String getName() { // hey java create a pointer called test, create a class and make that class implement that pointer -- anonymous class
                return "";
            }
            public void setName(String s) {

            }  // this class allows me to pass anything to print, after this scope the class will be eliminated
        };
        
        print(s1);
        print(f1);
        print(test);
        
    }

    public static void print(Person arg1) {
        System.out.println(arg1.getName());
    } // I will allow any object that implements person interface, as long as this class implemented the person interface then i can pass that object

    /**public static void printFaculty(Faculty arg1) {
        System.out.println(arg1.getName());
    }

    public static void printStudent(Student arg1) {
        System.out.println(arg1.getName());
    }*/
}
