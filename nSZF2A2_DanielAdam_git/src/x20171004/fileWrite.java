/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171004;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author DanielAdamZoltan
 */
public class fileWrite {
    public static void main(String[] args)throws Exception{
        try{
            FileWriter theFile = new FileWriter("src/x20171004/output.txt");
            BufferedWriter write = new BufferedWriter(theFile);
            
            for (int i = 1; i < 91; i++) {
                write.write(Integer.toString(i));
                write.newLine();
            }
            write.close();
        }
        catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
