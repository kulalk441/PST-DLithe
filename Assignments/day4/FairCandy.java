package Assignments.day4;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result =new int[2];
        int sumA=0;
        int sumB=0;
        Set<Integer> setB =new HashSet<>();
        for(int a:aliceSizes){
            sumA+=a;
        }
        for(int b:bobSizes){
            sumB+=b;
            setB.add(b);
        }
        int diff=(sumB-sumA)/2;
        for(int a:aliceSizes){
            if(setB.contains(a+diff)){
                result[0]=a;
                result[1]=a+diff;
                return result;
            }
        }
        return null;
    }
}