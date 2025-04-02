class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxSum=0;
        int xi=nums[0];
        int ij=0;

        for(int j=1;j<n-1;j++){
            ij=Math.max(ij,xi-nums[j]);
            maxSum=Math.max(maxSum,ij* (long)nums[j+1]);
            xi=Math.max(xi, nums[j]);
        }
        return maxSum;
    }
}