package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] inp = {"eat","bat","nat","tan","ate","ant"};
        Hashtable<String, ArrayList<String>> tab = new Hashtable<>();
        for(String each:inp){
            char[] temp = each.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            tab.putIfAbsent(key, new ArrayList<>());
            tab.get(key).add(each);
        }
        System.out.println(tab.values());
    }
}
