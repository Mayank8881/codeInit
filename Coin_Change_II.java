class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int ans=path(coins,coins.length-1,amount);
        return ans;
    }
    public int path(int[] coin,int i,int amount){
        int inf = (int) 1e9;
        if(i==0){
            if(amount%coin[i]==0) return 1;
            else return 0;
        }

        int nonPick=path(coin,i-1,amount);
        int pick=0;
        if(coin[i]<=amount){
            pick=path(coin,i,amount-coin[i]);
        }

        return pick+nonPick;
    }
}