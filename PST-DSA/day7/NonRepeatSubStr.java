package day7;

import java.util.Hashtable;

public class NonRepeatSubStr {
    public static int subStr(String og){
        int size=og.length(), start=0, end=0,mLen=0;
        Hashtable<Character,Integer> tab = new Hashtable<>();
        while(end<size){
            char key = og.charAt(end);
            if(tab.containsKey(key))
                start = Math.max(start,tab.get(key)+1);
            tab.put(key, end);
            mLen = Math.max(mLen,end-start+1);
            end++;
        }
        return mLen;
    }
    public static void main(String[] args) {
        String phrase = "pwwkew";
        System.out.println(subStr(phrase));
    }
}
