package ITE409.Week7;

import java.io.*;
// alot of classes for reading and writing operations
/**
 * 2 operation types:
 * input - data coming into my java application
 * 
 * Classes: Abstract class InputStream - read() reads 1 byte at a time and gives it to me as int - once data is run out you get -1
 * 
 * output - data sent from application to outside - write() writes 1 byte at a time
 * 
 * you cannot read/write to more than one file at a time, you can create objects of them to solve this problem
 * 
 * skip() and reset()
 * 
 * skip() skips a byte
 * reset() goes back to the starting byte
 * 
 * InputStream, InputStreamReader, FileInputStream
 * OutputStream,FileOutputStream, OutputStreamWriter
 * 
 */
public class Main {
    public static void main(String[] args) {
        // simple style
        try (InputStreamReader ir = new InputStreamReader(new FileInputStream("ITE409\\Week7\\ite409.txt")); ) {
            // try will call the close() method if you put any class in try() as argument
        }
         catch (Exception e) {
            // TODO: handle exception
        }



        // File file = new File("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\Week7\\ite409.txt");
        // File fileOut = new File("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\Week7\\auis.txt");
        // try {            
        //     InputStream in = new FileInputStream(file);
        //     OutputStream out = new FileOutputStream(fileOut);
        //     // inptustreamreader has constructors that allow you to specify the charset UTF 
        //     // if utf16, then it will execute 2 read operations at a time 
        //     InputStreamReader ir = new InputStreamReader(in); // reader will always work with files
        //     OutputStreamWriter ow = new OutputStreamWriter(out);
        //     // OutputStream out = new FileOutputStream(fileOut);
        //     char[] array = new char[100];
        //     ir.read(array);
        //     ow.write(array);
        //     System.out.println(array); // this is the robust way of doing it
        //     // use InputStreamReader if you are reading from a text file
        //     // any that is not UTF charset, InputStreamReader is useless
            


        //     int b = in.read();
        //     while (b!=-1) { // copy pasting operation
        //         char c = (char)b; // type casting so that we can print the english words // only works if i have a text file - that using unicode utf 8 - every character is 1 byte
        //         // if the content is written in another language, this will not work (kurdish/arabic is UTF 16 - every char is 2 bytes)
        //         System.out.print(" "+c);
        //         // out.write(b);
                
        //         b = in.read(); // will printout all the binary data in my text file as an integer    
        //     }
        //      // this will print the first letter 'h' and translates it into integer '104' as the value of that byte as an intger = 104

        //     // for (int i = 0; i < 10; i++) { // only read 10 bytes
        //     //     System.out.println(b);
        //     //     out.write(b);
        //     //     b = in.read();
        //     // }

        //     in.close(); // i dont need to read/write on this app anymore
        //     // out.close();
        // } catch (Exception e) {
        //     System.err.println(e);
        // } finally {
        //     // in.close(); this is what dr yad usually does to close his IO
        // }
        
    }
}
