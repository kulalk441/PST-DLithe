package day1;

import java.util.Arrays;

public class MovingZero {
    public static void move(int[] trucks){
        int valid = 0, traversal = 0, size = trucks.length;
        while(traversal<size){
            if(trucks[traversal]!=0){
                trucks[valid]=trucks[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(trucks, valid,size,0);
        System.out.println(Arrays.toString(trucks));
    }
    public static void main(String[] args) {
        move(new int[]{20,0,19,5,0,3,10,0,2});
        move(new int[]{3,0,0,1,0,5,0,6,0});
    }
}
