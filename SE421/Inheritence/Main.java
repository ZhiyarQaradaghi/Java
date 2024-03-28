package SE421.Inheritence;

public class Main {
    public static void main(String[] args) {
        // A o1 = new A();
        // A o2 = new A();

        // o1.x = 2024;
        // o2.x = 2025; 

        B o1 = new B();
        B o2 = new B();

        o1.y = 2024;
        o2.y = 2024;

        // System.out.println(o1 == o2); // are pointer o1 and pointer o2 pointing at the same memory space? False

        System.out.println(o1.equals(o2));        
        

    }        
}

class A { // if we have final with a class then there will be no inheritence with the class
    // private int x = 2024;
    // // protected -- acts like public for subclasses, private for non sub class
    
    // @Override
    // protected void finalize() { // destructor - used when
    //     System.out.println("OBJECT is deleted");
    // } 
    
    // public final void method1() { // if used with final, this method cannot be overriden by subclasses
    //     System.out.println("Method1 "+this.x);
    public int x;
    @Override
    public boolean equals(Object other) {
        boolean result = this == other;
        if (result) 
            return true;
        result = super.equals(other);

        if (other instanceof A) { // if other is pointing at an Object of A
            A p = (A)other;        
            result = result && (this.x == p.x);
            return true;                        
        }
        // result = result || (this.x == other.x);
        // result |= this == other; // |= means result = result || this == other
        return result;
    }
}

class B extends A {
    // @Override // called OverShadowing 
    // public void method1() {
    //     method1();
    // }

    // public void method2() {
    //     method1();
    // }
    @Override
    public boolean equals(Object other) {
        boolean result = super.equals(other); // 
      
        if (other instanceof B) { // if other is pointing at an Object of A
            B b = (B)other;        
            result = result && (this.x == b.x && this.y == b.y);
            return true;                        
        }

        return result;
    }
    public int y;
}
