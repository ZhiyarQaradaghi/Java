package SE421.Week4;

public class SE421 {
    public static void main(String[] args) {
        run();   
    }
    public static void run() {
        Course c = new Course();
        String s = "SE421"; // im creating an object of type string 
        //s.charAt(2``);
        Dept d = new Dept();

        c.setValues(2024, "SE421", "Computing and Info");// when you call this, ask how many arguments we have? how many of them are primitive data types? which arguments is passing by value and reference?
        // only the 2nd and 3rd pass by ref

        /** The connections between components define dependency
        Course depends on Dept

        The best class is the class that has the least dependency

        I use methods to manage dependency, so that it doesnt propagate back to the person relying on it

        An example of this is using the get and set methods 
        */
    }

    public void print() {
        System.out.println(this.year);
    }
    
    
}
