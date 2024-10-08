package ITE409.Interface_chapter8;

public class Faculty implements Person { // Faculty is a ---> Person
    private final int id = 0; // if you put keyword final, means i can only use = on this variable only once
    private String name;
    private int salary;


   

    public int getId() {
        return id;
    }

   /**Remove this set method so that the id can only be set by the constructor then changed to read only due to private access modifier 
    *   public void setId(int id) {
        this.id = id;
    } */

    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println(name);
        System.out.println(salary);
    }

}
