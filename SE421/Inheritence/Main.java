package SE421.Inheritence;

public class Main {
    //problems with inheritence:
    // 1. Tightly coupledness, 2. Code Duplication
    // Can be used for one thing only -- OVERRRIDING
    // To solve these problems, we will mimic inheritence with interface and a set of classes

    public static void main(String[] args) {
        // I obj = new A(new P(){
        //     @Override
        //     public void method1() {
        //         System.out.println("AUIS");                
        //     }
        // });

        // obj.method1();

        // I obj2 = new A(new P());

        // obj2.method1();

        I obj2 = new A();
        obj2.setParent(new C);

        // block of code and after one hour

        // i want to change the parent of the object constructed



    }
}

class C {

}

interface I {
    public void method1();
    public void method2();
}

class P implements I { // put shared code block from class A and B into class P 
    // design pattern : Object Composition
    public void method1(){
        // block of code 1
    }
    public void method2(){
        // block of code 2
    }
}

class A implements I {
    private I parent;
    public I getParent() {
        return parent;
    }
    public void setParent(I parent) {
        this.parent = parent;
    }
    // public A() {
    //     parent = new P();
    // }
    public A() {
        this(new P());
    }
    public A(I parent) {
        this.parent = parent;
    }
    public void method1(){
// eliminate block of code    
parent.method1();
// actual code is in parent
}
    public void method2(){
// eliminate block of code    
    parent.method2();

}
}

class B implements I {
    I parent;
    // public B() {
    //     parent = new P();
    // }

    public B(I parent) {
        this.parent = parent;
    }
    public void method1(){
        // eliminate block of code
        parent.method1();
    }
    public void method2(){
// eliminate block of code    
        parent.method2();
}
}

// class P {
//     public void method1(){
//         // block of code 1
//     }
//     public void method2(){
//         // block of code 2
//     }
// }

// class A extends P {
//     public void method3(){
//         // block of code 3
//     }
// }

// class B extends P {
//     @Override
//     public void method1(){
//         // bloc kfo code 4
//     }
