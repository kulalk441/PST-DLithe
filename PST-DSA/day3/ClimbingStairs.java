package day3;

public class ClimbingStairs {
    public static int climb(int stairs){
        if(stairs<=1) return 1;
        else if(stairs==2) return 2;
        else return climb(stairs-1)+climb(stairs-2);
    }
    public static void main(String[] args) {
        System.out.println(climb(5));
        System.out.println(climb(4));
        System.out.println(climb(2));
    }
}
