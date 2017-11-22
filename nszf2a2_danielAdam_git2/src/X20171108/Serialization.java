package X20171108;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.in;

class Tanulo implements Serializable{
    String nev;
    Integer kor;
}

public class Serialization {
    private static void make() throws IOException{
        Tanulo sanyi = new Tanulo();
        sanyi.nev = "Ruzsa Sándor";
        sanyi.kor = 160;
        
        
        Tanulo mari = new Tanulo();
        mari.nev = "Kiis Mária";
        mari.kor = 40;
        
        Tanulo tibi = new Tanulo();
        tibi.nev = "Nagy Tibor";
        tibi.kor = 21;
        
        FileOutputStream fos = new FileOutputStream("adat.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(sanyi);
        oos.writeObject(mari);
        oos.writeObject(tibi);
        oos.close();
    }
    private static void load() throws IOException, ClassNotFoundException{
        Tanulo egy = new Tanulo();
        Tanulo ketto = new Tanulo();
        
        
        FileInputStream fis = new FileInputStream("adat.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        egy = (Tanulo) ois.readObject();
        ketto = (Tanulo) ois.readObject();
        ois.close();
        
        System.out.println("adat1/1: " + egy.nev);
        System.out.println("adat1/2: " + egy.kor);
        
        System.out.println("adat2/1: " + ketto.nev);
        System.out.println("adat2/2: " + ketto.kor);
    }
    
    
    private static void load2() throws IOException, ClassNotFoundException{
        try {
            FileInputStream fis = new FileInputStream("adat.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Tanulo student = (Tanulo) ois.readObject();
                System.out.println(student.nev);
                System.out.println(student.kor);
                ois.close();
            } 
                }catch (EOFException e) {
                    System.out.println("Vége a fájlnak");
        
        }catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        make();
        //load();
        load2();
    }
}
