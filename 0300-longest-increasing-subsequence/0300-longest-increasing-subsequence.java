class Solution {
    public int lengthOfLIS(int[] nums) {
        int prev=-1;
        int dp[][]=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length+1;j++){
                dp[i][j]=-1;
            }
        }
        return LIS(0,-1,nums,dp);
    }

    public int LIS(int i,int prev,int nums[],int dp[][]){

        if(i==nums.length) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        //non-pick
        int nonpick=0+LIS(i+1,prev,nums,dp);

        //pick
        int pick=0;
        if(prev==-1 || nums[i]>nums[prev]){
            pick=1+LIS(i+1,i,nums,dp);
        }

        return dp[i][prev+1]=Math.max(pick,nonpick);
    }
}