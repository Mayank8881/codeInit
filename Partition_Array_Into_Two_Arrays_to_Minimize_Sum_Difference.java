class Solution {
    public int minimumDifference(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++) sum+=nums[i];
        Boolean dp[][]=new Boolean[n][sum+1];

        for(int i=0;i<n;i++) dp[i][0]=true;
        dp[0][nums[0]]=true;

        for(int i=0;i<n;i++){
            for(int j=1;j<=sum;j++){
                boolean nonPick=dp[i-1][sum];
                boolean pick=false;
                if(nums[i]<=sum){
                    pick=dp[i-1][sum-nums[i]];
                }
                dp[i][sum]=pick | nonPick;
            }
        }

        int mini=Integer.MIN_VALUE;
        for(int i=0;i<sum;i++){
            if(dp[n-1][i]==true){
                mini=Math.min(mini,Math.abs(i,sum-i));
            }
        }
        return mini;
    }
}