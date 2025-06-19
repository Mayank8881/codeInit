class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int mini=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-mini>k){
                count++;
                mini=nums[i];
            }
        }
        return count;
    }
}