package ITE409.Inheritencechp8;

public class AUISMember extends Person {

    private int Oldid; // sub classes cannot see this
    protected int id; // acts like private for everyone, and acts like public for you and all your subclasses
    // protected is only used when dealing with inheritence 
    public void setId (int id) {
        this.id = id;
    }

    public static String test() {
        return "From AUISMEMBER Class";
       }

    public int getId() {
        return this.id;
    }
    
}
