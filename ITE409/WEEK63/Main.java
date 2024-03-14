package ITE409.WEEK63;

/**
 * Assignment 1:
 * 
 * Everything combined in midterm 1
 * 
 * A game engine is for rendering graphics and give it to gpu
 * 
 * Req1: A class shape, every instance of that shape represents the shapes that will be rendered
 *      Create a class for shape
 * 
 * Req2: Randomely generate an ID for every shape, every shape must have a string color - getsetter methods - make it read only for ID once it is created do not change
 * 
 * Req3: Some shapes need to have a position in 3d, xyz, create sub classes for 3d shapes - cube, sphere
 * 
 * Req4: 2D space shaes, square, triangle, circle
 * 
 * req 3 and 4 are subclasses needed to be created from shape -- just give each 3d 3 numbers to define coordinates x,y,z - 2d as x,y maybe z too but keep it 0
 * 
 * 
 * Req5: GET SET methods for all the properties - colors ... and have method for calculating size or volume
 * 
 * Req6: Main method - main class - user input - create a data structure and store objects of shape into that data structure 10 times
 * 
 * ExtraReq: You need CUSTOM exceptions or non runtime
 *           USE OVERRIDE
 *           ELIMINATE CODE DUPLICATION
 */

//Chapter 15 - JAVA IO API
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // utilize the Java language with a certain API
        // how can we use the semantics we learned to use APIs
        

        // what is JAVA IO API?
        // Provides certain classes to handle input data/stream and output data/stream - DATA coming in/input stream from other applications, Data going out to another application Output stream
        // this is your java application that is talking to your OS at runtime so if you put this code on another setup, then it might not work 
        File f = new File("C:\\Users\\zhiya\\OneDrive\\Documents\\Studies\\Java\\ITE409\\WEEK63\\data.txt"); // File is a class in java io, File extends object
        
        // File represents a single file in your OS
        // One of the constructors allows you to provide a path to a file File(String pathname)

        // f.createNewFile(); // this throws a general exception, so you need to catch it
        // high possiblity this call will be rejected by OS
        try {
            f.createNewFile();
        } catch (IOException ex) {
            System.err.println(ex.getMessage()); // getMessage is a built in method
        } // an example of an error could be trying to create a file somewhere that it cannot access "Permission Denied"




        // System.out.println("Folder? "+f.isDirectory()); // this asks the api "Is this a folder?" will print false
        // System.out.println("file? "+f.isFile()); // this asks api "Is this file?" prints true
        // System.out.println("Exists? "+f.exists()); // does the file exist?

        // f.mkdir(); // makes directory if the folder path provided in File() doesnt exist
        // // it updates the folder time stamp if it exists and you still run the code

        // // do this
        // if (!f.exists()) {
        //     f.mkdir(); // if it doesnt exist, then create one 
        // }

        // if (f.exists()) {
        //     f.delete(); // if it exists, then delete it
        // }
    }
}
