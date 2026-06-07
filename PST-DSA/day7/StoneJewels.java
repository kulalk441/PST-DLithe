package day7;

import java.util.HashSet;
import java.util.Set;

public class StoneJewels {
    public static int findCount(String jw, String st){
        Set<Character> jSet = new HashSet<>();
        for(char each:jw.toCharArray()) jSet.add(each);
        int count = 0;
        for(char each:st.toCharArray()){
            if(jSet.contains(each)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // String jewels = "aA", stones="aAAbbbb";
        String jewels = "z", stones="ZZ";
        System.out.println(findCount(jewels, stones));
    }
}
