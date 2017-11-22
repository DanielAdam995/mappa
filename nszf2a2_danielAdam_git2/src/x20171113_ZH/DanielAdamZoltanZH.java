package x20171113_ZH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.StringTokenizer;
//Dániel Ádám Zoltán nszf2a2
public class DanielAdamZoltanZH {
    public static void main(String[] args) throws Exception {
        File theFile = new File("src/x20171113_ZH/valaszok.txt");
                int sum = 0;
                int db2 = 0;
                
                
        try{
            Scanner beolvas = new Scanner(theFile);
            while(beolvas.hasNextLine()){
                
                String sor = beolvas.nextLine();
                StringTokenizer st = new StringTokenizer(sor, ",");
                int db = st.countTokens();
                System.out.println("a bevitt adatok: " + sor);
        while(st.hasMoreTokens()){
        
            
            sum += Integer.parseInt(st.nextToken());
            db2++;
        
            
            beolvas.close();
        }
            }
        }
        catch(FileNotFoundException | NumberFormatException e){
            System.out.println("error: " + e.getMessage());
            System.out.println("hiba: " + e.getMessage().split(":")[1].trim().replace("\"", ""));
        }
        //System.out.println("a beolvasott számok " + db + " db összege= " + sum); 
        System.out.println("az uj db: " + db2);
        
       
            
            
        //darabolás
        
        
        
        }
        }
        
    
    
    
    

    
 

