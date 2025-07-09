class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return findTotal(n,dp);
    }
    public int findTotal(int i,int dp[]){
        if(i==0 || i==1) return 1;
        if(dp[i]!=-1) return dp[i];
        int one=findTotal(i-1,dp);
        int two=findTotal(i-2,dp);
        dp[i]=one+two;
        return dp[i];
    }
}