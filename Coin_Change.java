class Solution {
    public int coinChange(int[] coins, int amount) {
        int inf = (int) 1e9;
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans=path(coins,coins.length-1,amount,dp);
        if(ans>=inf) return -1;
        return ans;
    }
    public int path(int[] coin,int i,int amount,int dp[][]){
        int inf = (int) 1e9;
        if(i==0){
            if(amount%coin[i]==0) return amount/coin[i];
            else return inf;
        }

        if(dp[i][amount]!=-1) return dp[i][amount];

        int nonPick=path(coin,i-1,amount,dp);
        int pick=Integer.MAX_VALUE;
        if(coin[i]<=amount){
            pick=1+path(coin,i,amount-coin[i],dp);
        }

        return dp[i][amount]=Math.min(pick,nonPick);
    }
}