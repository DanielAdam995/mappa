package x20171004;
// @author danielAdamZoltan

import java.io.File;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args)throws Exception{
        
        
        File theFile = new File("src/x20171004/input.txt");
        
        try{
            Scanner eyes = new Scanner(theFile);
            while(eyes.hasNextLine()){
                String sor = eyes.nextLine();
                System.out.println(sor);
            }
            eyes.close();
        }
        catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
