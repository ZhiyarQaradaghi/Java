package SE421.Inheritence;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Maya");
        System.out.println(s.getName());

        for (int i = 0; i < 10; i++) {
            final int x = i;
            Student s1 = new Student() {
                // make a class on the fly and make it extend student
                // this is useful for overiding 
                @Override
                public String getName() {
                    // return "hello";
                    return super.getName() + " " + x;
                }
            };

            s1.setName("Ahmed");
            System.out.println(s1.getName()); // this will return hello no matter what setName is
            test(s1); // this will print all the getNames from all the inherited classes of Student pointer
        
        }

        
    }

    public static void test(Student s) { // what data type can i provide? all the classes that inherits student
        System.out.println(s.getName());
    }
}
class Person {
    private String name;

    public Person(String name) {
        System.out.println("Person Constructor");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Student extends Person {
  public Student(String n, int x) {
    super(n);
  }
  public Student() {
    super("");
    System.out.println("Student Constructor");
  }

  @Override
  public void setName(String name) {
      String s = name.toUpperCase();
      super.setName(s);
  }
}

class Faculty extends Person {
    public Faculty() {
        super("");
        System.out.println("Faculty Constructor");
    }

}
