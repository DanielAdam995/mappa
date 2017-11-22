package x20171018;

import java.util.Scanner;
import java.util.StringTokenizer;

public class io_token {
    public static void main(String[] args) {
        int sum = 0;
        int db2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több számot veszövel");
        String sor = sc.nextLine();
        //darabolás
        StringTokenizer st = new StringTokenizer(sor, ",");
        int db = st.countTokens();
        
        System.out.println("a bevitt adatok: " + sor);
        while(st.hasMoreTokens()){
        try{
            
            sum += Integer.parseInt(st.nextToken());
            db2++;
        
        }catch(NumberFormatException ne){
            System.out.println("hiba: " + ne.getMessage().split(":")[1].trim().replace("\"", ""));
          }      
        }
        System.out.println("a beolvasott számok " + db + " db összege= " + sum); 
        System.out.println("az uj db: " + db2);
    } 
}
