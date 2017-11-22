package x20170906;

 //@author DanielAdam
import java.util.Scanner;



public class DanielAdamZoltan_szemszam {
    static String szam;
    static int k;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String szam = sc.next();
        // 
        int utolso = Character.getNumericValue(szam.charAt(10));
        
        
            if (k%11==utolso) {
                System.out.println("egyezik");
            }else{
                System.out.println("nem egyezik");
            }
            int nem = Character.getNumericValue(szam.charAt(0));
            
            if (nem%2==00) {
                System.out.println("nö");
            }else{
                System.out.println("férfi");
            }   
        
            String szam1 = String.valueOf(szam.charAt(1));
            String szam2 = String.valueOf(szam.charAt(2));
            String szam3 = szam1 + szam2;
            int x = 0;
            x = Integer.parseInt(szam3);
            if (x<97 && x>20) {
               for (int i = 0; i < 10; i++) {
            
           int seged = Character.getNumericValue(szam.charAt(i+1));
            
            
               }
          }else{
                  for (int i = 0; i < 10; i++) {
            
           int seged = Character.getNumericValue(szam.charAt(10-1));
            
            
                  }  
        }
       
    }
    
        
    }
    

