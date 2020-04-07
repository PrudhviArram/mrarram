package edu.bmp;

import java.io.*;
import java.math.*;

public class Image {
public static void main(String[] args) {

String fileName = "forest.bmp";
   try {
            // Use this for reading the data.
            byte[] BMPFileHeader = new byte[14];
            byte[] buffer2 = new byte[2];
            byte[] buffer4 = new byte[4];

            FileInputStream inputStream =
                new FileInputStream("forest.bmp");

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            int b = 0; // is an index into the 14-byte BMPFileHeader
            nRead = inputStream.read(BMPFileHeader);
            if (nRead == 14) {
            for (int i=0; i<2; i++) {
            	buffer2[i] = BMPFileHeader[b++];
            }
            System.out.println (new String(buffer2));
           
            for (int i=3; i>=0; i--) {
            	buffer4[i] = BMPFileHeader[b++];
            }
            
            System.out.println ("File size = " + new BigInteger(buffer4).intValue());
            total += nRead;
            }
           
            // Example: print the 4 bytes containing the offset image data
            //buffer4[3] = BMPFileHeader[10];
            //buffer4[2] = BMPFileHeader[11];
            //buffer4[1] = BMPFileHeader[12];
            //buffer4[0] = BMPFileHeader[13];
           
            // This for loop does what the above 4 lines of code does
            for (int i=3, k=10; i>=0; i--,k++) {
            	buffer4[i] = BMPFileHeader[k];
            }
            System.out.println ("Image offset = " + new BigInteger(buffer4).intValue());
           
            // TODO: Read in the next 40 bytes from the file
            //  create a 40-byte buffer called BMPHeader
            //  read into the buffer from the file
            byte[] DIBFileHeader = new byte[40];
            
            // TODO: Copy the 4 bytes representing the image width from the BMPHeader into buffer4
            // TODO: Print out (as an integer) the width "Image width = xxxxx"
            byte[] buffer = new byte[4];
           
            // TODO: Copy the 2 bytes representing the bits-per-pixel from the BMPHeader into buffer2
            // TODO: Print out (as an integer) the bits-per-pixel "Bits-per-pixel = xxxx"
            byte[] buffer1 = new byte[2];
            FileInputStream is = new FileInputStream("forest.bmp");
            nRead = is.read(DIBFileHeader);

            for (int i=3, k=18; i>=0; i--,k++)
            {
            	buffer[i] = DIBFileHeader[k];
            }	
            
        System.out.println ("Width of the image : " + new BigInteger(buffer).intValue());

        for (int i=3, k=22; i>=0; i--,k++) {
        	buffer[i] = DIBFileHeader[k];
        }
            

        System.out.println ("Height of the image : " + new BigInteger(buffer).intValue());

        for (int i=1, k=28; i>=0; i--,k++) {
        	buffer1[i] = DIBFileHeader[k];
        }
            

        System.out.println ("No.of bits per pixel = " + new BigInteger(buffer1).intValue());
           
           
            // Always close files.
            inputStream.close();        
            is.close();
            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + fileName + "'");                  
            // Or we could just do this:
            // ex.printStackTrace();
        }
}
}
