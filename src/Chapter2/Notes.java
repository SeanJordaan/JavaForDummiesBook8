/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    Understanding Streams
A stream is simply a flow of characters to and from a program. The other end of 
the stream can be anything that can accept or generate a stream of characters, 
including a console window, a printer, a file on a disk drive, or even another 
program   
You can roughly divide the world of Java stream I/O into two camps:
1)Character streams: Character streams read and write text characters that 
represent strings.You can connect these text files to store data on the hardrive 
text files use special characters called delimiters to separate elements of the file
 A comma-delimited file uses commas to separate individual fields of data.
 A tab-delimited file uses tabs to separate fields.(Someone needs to explain this diffrently) 
2)Binary streams: Binary streams read and write individual bytes that represent 
primitive data types. You can connect a binary stream to a binary file to store binary data on a hard drive


    Reading Character Streams
To read a text file through a character stream, you usually work with the following classes:
1) File: The File class represents a file on the hard drive the ain reason for this class,
is to identify which file you want to read or right from 
2) FileReader: The FileReader class provides basic methods for reading data 
from a character stream that originates from a file it provides a method to let you 
read data one character at a ttime 
You can instead, you create a FileReader object to connect your 
program to a file and then pass that object to the constructor of the 
BufferedReader class, which provides more efficient access to the file
the fileReader class Creates a file reader from the specified File object
3)BufferedReader: This class “wraps” around the FileReader class to provide 
more efficient input.. This hellps the program work faster, because it reads big chunks 
of data and not a byte at a time. the bufferReader extends the reader class 


    Creating a BufferedReader
The normal way to connect a character stream to a file is to create a File object 
for the file.
Then you can call the FileReader constructor to create a FileReader object and pass this 
object to the BufferedReader constructor to create a BufferedReader object
File f = new File("movies.txt");
BufferedReader in = new BufferedReader(
 new FileReader(f));
Here a BufferedReader object is created to read the movies.txt file*.

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
