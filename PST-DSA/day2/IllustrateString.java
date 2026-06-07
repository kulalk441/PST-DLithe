package day2;

public class IllustrateString {
    public static void main(String[] args) {
        // literal way
        String alpha = "Razak Mohamed";
        String beta = new String("nitte");// non literal
        // contains in built methods
        char[] delta = alpha.toCharArray();
        byte[] exclipse = beta.getBytes();
        // System.out.println(beta=="nitte");
        System.out.println(beta.equalsIgnoreCase("NITTE"));
        System.out.println(alpha=="Razak Mohamed");
        String[] words = alpha.split(" ");
        System.out.println(words.length);
        System.out.println(beta.charAt(0));
        

    }
    
    
}
