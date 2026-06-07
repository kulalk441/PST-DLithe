package day7;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public static int unique(String[] arr){
        String[] codes = {".-","-...","-.-.",
        "-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};
        Set<String> uStore = new HashSet<>();
        for(String each:arr){
            StringBuilder build = new StringBuilder();
            for(char ch:each.toCharArray())
                build.append(codes[ch-'a']);
            uStore.add(build.toString());
        }
        return uStore.size();
    }
    public static void main(String[] args) {
        String[] arr={"gin","zen","gig","msg"};
        System.out.println(unique(arr));
    }
}
