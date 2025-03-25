class Solution {
    public int coinChange(int[] coins, int amount) {
        int inf = (int) 1e9;
        int ans=path(coins,coins.length-1,amount);
        if(ans>=inf){
            return -1;
        }
        return ans;
    }
    public int path(int[] coin,int i,int amount){
        int inf = (int) 1e9;
        if(i==0){
            if(amount%coin[i]==0) return amount/coin[i];
            else return inf;
        }

        int nonPick=path(coin,i-1,amount);
        int pick=Integer.MAX_VALUE;
        if(coin[i]<=amount){
            pick=1+path(coin,i,amount-coin[i]);
        }

        return Math.min(pick,nonPick);
    }
}