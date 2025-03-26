class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans=path(coins,coins.length-1,amount,dp);
        return ans;
    }
    public int path(int[] coin,int i,int amount,int dp[][]){
        int inf = (int) 1e9;
        if(i==0){
            if(amount%coin[i]==0) return 1;
            else return 0;
        }

        if(dp[i][amount]!=-1) return dp[i][amount];

        int nonPick=path(coin,i-1,amount,dp);
        int pick=0;
        if(coin[i]<=amount){
            pick=path(coin,i,amount-coin[i],dp);
        }

        return dp[i][amount]=pick+nonPick;
    }
}