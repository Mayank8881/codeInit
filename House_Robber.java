class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return robber(n-1,nums,dp);
    }

    public int robber(int idx,int nums[],int dp[]){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;

        int pick=nums[idx]+robber(idx-2,nums,dp);
        int nonPick=robber(idx-1,nums,dp);

        return Math.max(pick,nonPick);
    }
}