package SE421.Constructors;

public class Student { // should i call this students or student? If i want to represent a single student then I call it student, if i have a group of students then students
    private int id;
    private String name;
    private double gpa; //double 8 bytes  -- we have alot of memory so we dont want float and have to cast it whenever we call it and set it
                        // float 4 bytes

    public static int year;

    static { // this will execute the first time, will be called only once - doesnt matter how many you create objects
            // limitation, you cannot access any member that is not static so you cannot put id or gpa here
        year = 2024;
    }
    // DESTRUCTORS : a method that will be called when the object is destroyed/removed - used for clean up process
    // HOMEWORK : how do you use this?
    // Why would we have to use a private constructors? -- to encapsulate a constructor to a class, making sure no other class can access it


    // public Student() {
    //     this(0); // go to the constructor with one integer parameter
    //     // this will now run the other 2 constructors
    //     System.out.println("Constructor 1");
        
        
    // }

    // public Student(int i) {
    //     // this(i,""); // go to the constructor with one integer and string parameter
    //     System.out.println("Constructor 2");
    //     this.gpa = -1;
    //     this.name = "";
    //      //this.id = i; this is not preferred because maybe you got some logic in setId
    //     // setId(i); this is better

    // }

    public Student(int i) { // make the id into read only - only set once per object -- alot of complexity can be hidden if you make it read only
        System.out.println("Constructor 1");
        this.id = i;
    }

    // public Student(int id, String name) {
    //     System.out.println("Constructor 3");
    //     //this.id = i; this is not preferred because maybe you got some logic in setId
    //     setId(id);
    //     setName(name);
    // }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
