class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        if(nums[0]<k) return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k) count++;
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
        }
        return count;
    }
}