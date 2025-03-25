class Solution {
    public int coinChange(int[] coins, int amount) {
        return path(coins,coins.length-1,amount);
    }
    public int path(int[] coin,int i,int amount){
        if(i==0){
            if(amount%coin[i]==0) return amount/coin[i];
            else return -1;
        }

        int nonPick=path(coin,i-1,amount);
        int pick=Integer.MAX_VALUE;
        if(coin[i]<=amount){
            pick=1+path(coin,i,amount-coin[i]);
        }

        return Math.min(pick,nonPick);
    }
}