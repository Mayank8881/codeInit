class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp, -1);
        return robber(nums.length-1,nums,dp);
    }
    public int robber(int i ,int[] arr,int[] dp){
        if(i<0) return 0;

        if(dp[i]!=-1) return dp[i];
        int pick=arr[i]+robber(i-2,arr,dp);
        int nonPick=robber(i-1,arr,dp);

        dp[i]=Math.max(pick,nonPick);
        return dp[i];
    }
}