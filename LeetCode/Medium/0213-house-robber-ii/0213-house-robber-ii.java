class Solution {
    public int rob(int[] nums) {

        if(nums.length==1)  return nums[0];

        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int first=robber(nums.length-2,nums,dp,0);

        int dp2[]=new int[nums.length];
        Arrays.fill(dp2,-1);
        int second=robber(nums.length-1,nums,dp2,1);

        return Math.max(first,second);
    }
    public int robber(int i,int[] arr,int[] dp,int start){
        if(i<start) return 0;

        if(dp[i]!=-1)  return dp[i];

        int pick=arr[i]+robber(i-2,arr,dp,start);
        int nonPick=robber(i-1,arr,dp,start);

        dp[i]=Math.max(pick,nonPick);
        return dp[i];
    }
}