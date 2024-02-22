package ITE409.PcShop;

public class Interface {
  
    public static void main(String[] args) {

        System.out.println("-------[||TESTING OBJECTS||]-------");
        
        Laptop l1 = new Laptop();
        Desktop dt1 = new Desktop();
        
        l1.setModelName("ASUS ZEPHYRUS G15");
        dt1.setModelName("MSI PREBUILD GAMING PC");

        System.out.println("-------PUTTING VALUES FROM SET METHOD INTO AN ARRAY-------");
        String modelArray[] = new String[2];

        modelArray[0] = l1.getModelName();
        modelArray[1] = dt1.getModelName();

        System.out.println(modelArray[0]);
        System.out.println(modelArray[1]);

        System.out.println("-------TESTING PRINT METHODS WITH OBJECT POINTERS-------");
        printLaptop(l1);

        printDesktop(dt1);

        System.out.println("-------TESTING INTERFACE-------");       
        
        Device d1 = new Laptop();
        Device d2 = new Desktop();

        // Need to initialize set method again for a new object pointer

        // The main advantage of an interface is that we get to create a class based on different classes without having to write entire methods, we just declare them in the interface class 
        // The classes that implement the interface will give the interface all their methods and variables to be used by the interface - called inheritance 
        // This is called "polymorphism" -- lets us to a single action with different ways 
        
        d1.setModelName("ASUS ZEPHYRUS G15");
        d2.setModelName("MSI PREBUILD GAMING PC");

        printDevice(d1);    
        printDevice(d2);    

    }

    public static void printDevice(Device arg1) { // <--- using interface for both
        System.out.println(arg1.getModelName());
    }

    public static void printLaptop(Laptop arg1) {  // <--- no interface used
        System.out.println(arg1.getModelName());
    }

    public static void printDesktop(Desktop arg1) { // <--- no interface used
        System.out.println(arg1.getModelName());
    }

    
}
