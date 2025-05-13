class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            for(int j=i;j<nums.length-1;i++){
                sum+=nums[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}