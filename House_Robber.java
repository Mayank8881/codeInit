class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
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
 
}