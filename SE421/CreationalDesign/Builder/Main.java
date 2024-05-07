package SE421.CreationalDesign.Builder;

// Creational Design Pattern - creating objects from classes and restricting the keyword new to get requirements
// 1. Factory
// 2. DI
// 3. Builder -- last se421 pattern
/**
 * 1. Strategy pattern used most
 * 2. Builder used 2nd most
 * 
 * Builder is usually used alone 
 * 
 * Builder design pattern is about creating complex objects step by step - when you have an object that is complex in nature, you are trying to faciliate this complexity when creating a new object of that class
 * -- used often when dealing with complex data types !
 * -- not services ! services is with factory and DI
 * 
 * allows caller to express there preferences and build it based on that 
*/



public class Main {
    public static void main(String[] args) {
        // caller should use builder class
        ShapeBuilder builder = new ShapeBuilder();
        // builder.setX(10).setY(10).setZ(30);
        // get the object from the previous and call setY with it and so on...

        Shape s = builder.setX(10).setY(20).setZ(30).build();
        Shape s2 = builder.build(); // you dont have to keep calling the constructor

        

        System.out.println("x : "+s.getX());
        System.out.println("y : "+s.getY());
        System.out.println("z : "+s.getZ());

        // set value of x and z but not y
        // difference between builder and factory - factory is with build() with the new 
    }    
}   

// responsiblity - build shape objects
// copy and paste all the members of the shape class
class ShapeBuilder {
    private int x;
    private int y;
    private int z;

    public ShapeBuilder() {
        this.x = this.y = this.z = -1;
    }

    public int getX() {return this.x;}
    
    public int getY() {return this.y;}

    public int getZ() {return this.z;}

    // modify set methods - we are trying to help the caller so that he doesnt keep setting values with builder.set
    public ShapeBuilder setX(int x) {this.x = x;  return this;}

    public ShapeBuilder setY(int y) {this.y = y;  return this;}
    
    public ShapeBuilder setZ(int z) {this.z = z;  return this;}

    public Shape build() {
        Shape s = new Shape(this.getX(), this.getY(), this.getZ());
        return s;
    }

}

// it becomes immutable because of builder -- immutable is a class that doesnt change its state !
// the problem with immutable object pattern was space complexity with creating objects for each set method, but that is not the case here with builder !
// never use immutable objects alone due to the space complexity problem
class Shape {
    private final int x;
    private final int y;
    private final int z;

    public Shape() {
        this.x = this.y = this.z = -1;
    }

    public Shape(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // // maybe caller just wants to provide value for x and y
    // public Shape(int x, int y) {
    //     this();
    //     this.x = x;
    //     this.y = y;
    // }

    // // maybe caller just wnats to provide value for x
    // public Shape(int x) {
    //     this();
    //     this.x = x;
    // }

    // what if he wants to provide value of y and z but not x -- not possible with the current constructor 
    // this wont work because method overloading rule broken -- same number of arguments and data type is not method overloading
    // public Shape(int y, int z) {
    //     this();
    //     this.y = y;
    //     this.z = z;
    // }

    public int getX() {return this.x;}
    
    public int getY() {return this.y;}

    public int getZ() {return this.z;}

    // no longer need setting set because builder will set it
    // public void setX(int x) {this.x = x;}

    // public void setY(int y) {this.y = y;}
    
    // public void setZ(int z) {this.z = z;}



}