package day6;

import java.util.Deque;
import java.util.Hashtable;
import java.util.LinkedList;

public class LRUCache {
    private int size;
    private Deque<Integer> deq=new LinkedList<>();
    private Hashtable<Integer,Integer> tab=new Hashtable<>();
    public LRUCache(int cap){this.size=cap;}
    public void put(int key, int value){
        if(tab.containsKey(key)){
            deq.remove(key);
            tab.put(key, value);
            deq.offerFirst(key);
            System.out.println(tab);
            return;
        }
        if(deq.size()==size){
            int exists = deq.pollLast();
            tab.remove(exists);
            System.out.println("LRU key was "+exists+", evicts key, cache is "+tab);
        }
        tab.put(key, value);
        deq.offerFirst(key);
        System.out.println(tab);
    }
    public int get(int key){
        if(tab.containsKey(key)){
            deq.remove(key);
            deq.offerFirst(key);
            return tab.get(key);
        }else return -1;
    }
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4

    }
}
