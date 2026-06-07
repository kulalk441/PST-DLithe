package day4;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] alpha = {1,4,6,0,0};
        int m = 3, n =2;
        int[] beta = {2,5};
        int left = m-1, right = n-1, pos = m+n-1;
        while(left>=0&&right>=0){
            if(alpha[left]>beta[right])
                alpha[pos--] = alpha[left--];
            else alpha[pos--] = beta[right--];
        }
        while(right>=0)alpha[pos--] = beta[right--];
        System.out.println(Arrays.toString(alpha));
    }
}
