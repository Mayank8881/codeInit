class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        // return robber(n-1,nums,dp);

        int neg=0;
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            
            int nonPick=dp[i-1];

            dp[i]=Math.max(pick,nonPick);
        }
        return dp[n-1];
    }
 
    public int robber(int idx,int nums[],int dp[]){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;

        if(dp[idx]!=-1) return dp[idx];
        int pick=nums[idx]+robber(idx-2,nums,dp);
        int nonPick=robber(idx-1,nums,dp);

        return dp[idx]=Math.max(pick,nonPick);
    }
}