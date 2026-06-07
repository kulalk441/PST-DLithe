package day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import day3.Patient;

public class PojoSet {
    public static void main(String[] args) {
        Patient patient1= new Patient("Manikandan", 24, "male", 56, 167.8);
        Patient patient2= new Patient("Vidya", 18, "female", 49, 146.8);
        Patient patient3= new Patient("Richard", 47, "male", 98, 178.8);
        Patient patient4= new Patient("Mythili", 21, "female", 56, 165.8);
        Patient patient5= new Patient("Vikas", 36, "male", 56, 186.8);
        HashSet<Patient> set1 = new HashSet<>();
        LinkedHashSet<Patient> set2  = new LinkedHashSet<>();
        TreeSet<Patient> set3 = new TreeSet<>();
        set2.add(patient1);set2.add(patient2);
        set2.add(patient3);set2.add(patient4);
        set2.add(patient5);
        set1.addAll(set2);
        set3.addAll(set2);
        System.out.println("Hash "+set1);
        System.out.println("Linked Hash "+set2);
        System.out.println("Tree "+set3);
    }
}
