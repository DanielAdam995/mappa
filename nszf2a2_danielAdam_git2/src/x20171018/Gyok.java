package x20171018;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gyok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#.###");
        try{
            double szam = sc.nextDouble();
            double négyzetgyök = Math.sqrt(szam);
            if (Double.isNaN(négyzetgyök)) // nem definiált művelet
                throw new Exception();
            System.out.println(df.format(szam) + " négyzetgyöke " + df.format(négyzetgyök));
        } catch (InputMismatchException ime) {
            System.err.println("Csak számból lehet négyzetgyököt vonni!");
        } catch (Exception e) {
            System.err.println("Negatív számból nem lehet négyzetgyököt vonni!");
        }
    }
}
