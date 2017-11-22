package x20170927;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;


    public class DanielAdamZoltan_BeolvasKiir {
        
    public static void main(String [] args) {

        //beolvas
        
        // The name of the file to open.
        String fileName = "fajl.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
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
        //#######################
        
        
       //generál
        
        Random rand = new Random();
         int[] n = new int[100];
        for(int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(100);
        }
         //kiir
        
        
        // The name of the file to open.
        String fileName1 = "temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName1);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(Integer.toString(n[i]));

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName1 + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        
        
        //########
        
        
        
    }

}

