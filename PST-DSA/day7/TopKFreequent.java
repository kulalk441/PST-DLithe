package day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreequent {
    public static void findFreq(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
        new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(int each:nums)
            map.put(each, map.getOrDefault
                    (each, 0)+1);
        for(Map.Entry<Integer,Integer> each:map.entrySet()){
            pq.offer(each);
            if(pq.size()>k) pq.poll();
        }
        int[] arr = new int[k];
        for(int index=0;index<k;index++)
            arr[index] = pq.poll().getKey();
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // int arr[] = {1,1,2,1,2,3}, k = 2; 
        int arr[] = {1,2,1,2,1,2,3,3,2}, k = 1; 
        findFreq(arr, k);
    }
}
