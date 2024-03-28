package ITE409.JAVAIO;
import java.io.*;
// chapter 15 - JAVA IO
public class main {
    public static void main(String[] args) {
        try {
            // filterinputstream filteroutputstream -- *** topic



            OutputStream os = new FileOutputStream("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\JAVAIO\\ite409.txt");
            BufferedOutputStream bos = new BufferedOutputStream(os, 4096); // 4096 = 1024*4 1 kb x 4
            // we are combining the write operations and do it once before doing it one by one since thats not cheap
            // bufferedoutputstream is really good with sending tcp messages/ instead of sending byte by bye and having spike in traffic, it will send it all at once in one packet

            //chrome and firefox read based on scrolling, if its 2gb of data then they only load like 10% of it until you scroll to a certain part
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            User u = new User();
            u.setUsername("User123");
            u.setPassword("pass123"); 
            oos.writeObject(u);

            // which to use
            bos.flush(); // memory is stored 
            oos.close(); // if computer crashes, then data will be lost
        
        } catch (Exception ex) {

        }

    }
}



class User implements Serializable { // when we serialize a variable, even a private one, it still is in that memory and can be read
    // when we send this object User to java io and output it to a file then we make a change in User and then the file is inputted back to our User object, data will be corrupted because the original User is changed
    //solution to above problem:
    private static final long serialVersionUID = 10000l; // when you serialize the original object, this var will be stored in the file, so if you make any changes then change the serialVersionUID as well
    // write this everytime when you have serializable, if you change anything in the class then change the value of this too

    private String username;    
    // transient in context of serializable it means ignore this variable and dont serialize it
    private transient String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
