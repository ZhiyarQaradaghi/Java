package ITE409.JAVAIO;
import java.io.*;
// chapter 15 - JAVA IO
public class main {
    public static void main(String[] args) {
        try {
            // byte b = 100;

            // // dont use FileWriter because this will convert it to String and read it as  3 bytes - 1 for each char - and will have to convert it back to byte
            // // O(n)

            // // os.write(b); // write it directly as binary without converting to string
            // // os.close();

            // byte b = (byte) in.read();
            
            // System.out.println(b);
            // in.close();

            // // best solution to reading and writing binary data compared to InputSreamReader and OutputStreamWriter which take too much resources and time
            // OutputStream os = new FileOutputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            // DataOutputStream dos = new DataOutputStream(os);
            // int x = 1000000; // 1 int -> 4 bytes
            // dos.writeInt(x); // writes int as binary data
            // InputStream in = new FileInputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            // DataInputStream din = new DataInputStream(in);
            // System.out.println(din.readInt()); // reads binary data as integer
            // // If you use dataoutputstream then you MUST use datainputstream to read the data
            
            // Student s = new Student(1, "Maya", 3,2f); // this is what office does when saving your file
            // s.name = new Dept();
            // s.dept.deptname = "Computing and Info."
            // OutputStream os = new FileOutputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            // DataOutputStream dos = new DataOutputStream(os);
            // dos.writeInt(s.id);
            // dos.writeUTF(s.name);
            // dos.writeFloat(s.gpa);
            // dos.close(); // the problem with this : NOT PRACTICAL
            // // Sometimes you have more complex object

            // more practical solution
            // Student s = new Student(1, "Maya", 3.2f);
            // s.dept = new Dept();
            // s.dept.name = "Computing and Info.";
            // OutputStream os = new FileOutputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            // ObjectOutputStream oos = new ObjectOutputStream(os);

            // oos.writeObject(s);
            // oos.close();
            // reading part
            InputStream in = new FileInputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            ObjectInputStream ois = new ObjectInputStream(in);

            Object o = ois.readObject();

            if (o instanceof Student) {
                Student s = (Student) o;
                System.out.println(s.name);
                System.out.println(s.id);

            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

class Dept implements Serializable {
    String name;
}

// example if we have objects in our application
class Student implements Serializable { // needs to implements serializable if you use ObjectOUtputStream
    public int id;
    public String name;
    public float gpa;
    public Dept dept;

    public Student(int id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}
