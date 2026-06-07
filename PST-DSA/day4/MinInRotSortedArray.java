package day4;

public class MinInRotSortedArray {
    public static void main(String[] args) {
        // int[] arr = {3,4,5,1,2};
        int[] arr = {11,12,13,14};
        int left = 0, right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[right]) left=mid+1;
            else right = mid;
        }
        System.out.println(arr[left]);
    }
}
