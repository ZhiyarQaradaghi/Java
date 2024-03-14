package ITE409.INCLASSLAB;
import java.io.*;

// create a file object that is pointing at your desktop directory
// Print names of all files that exist in desktop directory

// Extra excerise 
// do the same but print the size as well in bytes -- looks easy but how are you going to calculate the size of directories

public class Main {
    public static void main(String[] args) {
        File d1 = new File("C:\\Users\\zhiya\\OneDrive\\Desktop");

        FileFilter ff = new FileFilter() {
            public boolean accept(File f) { // you can filter list files
                return false;
            }
        };
                            //     filter
        File list[] = d1.listFiles(ff); // list exists too, list gives you an array of string
                                      // listFiles gives you an array of file OBJECTS

        for (File f : list) {
            
                System.out.print(f.getName());
        }

        
    }    
}
