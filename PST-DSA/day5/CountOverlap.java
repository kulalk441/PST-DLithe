package day5;

import java.util.Arrays;

public class CountOverlap {
    public static int erase(int[][] slots){
        if(slots.length==0) return 0;
        Arrays.sort(slots,(row1,row2)->row1[1]-row2[1]);
        int count = 0, pEnd = slots[0][1];
        for(int index=1;index<slots.length;index++)
            if(slots[index][0]<pEnd) count++;
            else pEnd = slots[index][1];
        return count;
    }
    public static void main(String[] args) {
        // int[][] slots = {{1,2},{2,3},{3,4},{1,3}};
        int[][] slots = {{1,2},{2,3},{2,4},{3,5}};
        System.out.println(erase(slots));
    }
}
