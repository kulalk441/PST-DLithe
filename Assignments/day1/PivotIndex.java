class Solution {
    public int pivotIndex(int[] nums) {
               int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        int l_sum=0;
        for(int i=0;i<nums.length;i++){
            if(l_sum==(sum-l_sum-nums[i])){
                return i;
            }
            l_sum +=nums[i];
        }
        return -1;
        
    }
}
