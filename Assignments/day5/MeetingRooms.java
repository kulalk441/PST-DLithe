package Assignments.day5;

import java.util.Arrays;

class Solution {

    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return true;
        }

        // Sort meetings by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Check for overlap
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] intervals1 = {
            {0, 30},
            {5, 10},
            {15, 20}
        };

        int[][] intervals2 = {
            {7, 10},
            {2, 4}
        };

        System.out.println("Example 1: " +
                sol.canAttendMeetings(intervals1)); // false

        System.out.println("Example 2: " +
                sol.canAttendMeetings(intervals2)); // true
    }
}
