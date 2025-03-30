class Solution {
    public int kadane(int nums[]){
        
        int n=nums.length;
        int sum=nums[0],maxSum=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int kadaneSum=kadane(nums);
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            nums[i]=-nums[i];
        }
        
        int maxSum=kadane(nums)+total;
        if (maxSum == 0) return kadaneSum;
        return Math.max(maxSum,kadaneSum);
    }
}