package x20171025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class szoveg_beolvas {
    public static void main(String[] args)throws Exception{
        
        
        File theFile = new File("src/vissza.txt");
        
        try{
            

            Scanner eyes = new Scanner(theFile);
            while(eyes.hasNextLine()){
                String sor = eyes.nextLine();
                System.out.println(sor);
                StringBuilder str = new StringBuilder(sor);
                System.out.println("alap = " + str);
                System.out.println("visszafele = " + str.reverse());
            }
            eyes.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("nem talákható a fájl" + fnfe.getMessage());
        }
    }
}
