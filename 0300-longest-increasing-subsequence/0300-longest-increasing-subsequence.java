class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }

        int maxi=1;
        for(int i=0;i<nums.length;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[prev]<nums[i] && 1+dp[prev]>dp[i]){
                    dp[i]=(1+dp[prev]);
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}