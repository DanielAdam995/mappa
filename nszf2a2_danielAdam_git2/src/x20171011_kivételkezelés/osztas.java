package x20171011_kivételkezelés;

import java.util.Scanner;

/**
 *
 * @author Tanulo
 */
public class osztas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az osztandot ");
        int osztando = sc.nextInt();
        System.out.println("Kérem az osztot ");
        int oszto = sc.nextInt();
        
        boolean sikeres = false;
        double hanyados = 0.0;
        
        try {
            //hanyados = ((double)osztando / (double)oszto);
            hanyados = (double)(osztando / oszto);
            System.out.println(osztando + " / " + oszto + " = " + hanyados);
            sikeres = true;
        } catch (ArithmeticException ae) {
            System.out.println("hiba: " + ae.getMessage());
        }
        finally{
            if (sikeres) {
                System.out.println("Az osztas rendben lezajlotzt");
            }else{
                System.out.println("az osztas sikertelen");
            }
        }
    }
}
