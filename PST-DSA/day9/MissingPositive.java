package day9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingPositive {
    public static void main(String[] args) {
        // int[] arr={7,8,9,11,12};
        int[] arr={0,1,2};
        Set<Integer> nums = new HashSet<>();
        Arrays.stream(arr).forEach(nums::add);
        int found = IntStream.range(
            1, Integer.MAX_VALUE).
        filter(pos->!nums.contains(pos)).
        findFirst().getAsInt();
        System.out.println(found);
    }
}
