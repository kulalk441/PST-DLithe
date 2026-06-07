package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import day3.Patient;

public class Serializing {
    static File file = new File("PatientRecord.doc");
    // write objects into file
    public static void serialize(List<Patient> patients) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(patients);
        oos.close();
        fos.close();
    }
    // read objects from file
    public static void deserialize() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Patient> exists = 
                 (List<Patient>)ois.readObject();
        ois.close();
        fis.close();
        System.out.println(exists);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Patient patient1= new Patient("Manikandan", 24, "male", 56, 167.8);
        // Patient patient2= new Patient("Vidya", 18, "female", 49, 146.8);
        // Patient patient3= new Patient("Richard", 47, "male", 98, 178.8);
        // Patient patient4= new Patient("Mythili", 21, "female", 56, 165.8);
        // Patient patient5= new Patient("Vikas", 36, "male", 56, 186.8);
        // List<Patient> myList = List.of(patient1,patient2,patient3,patient4,patient5);
        // serialize(myList);
        deserialize();
    }
}
