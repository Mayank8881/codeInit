class Solution {
    public int minimumDifference(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            nums[i] = Math.abs(nums[i]); 
            sum+=nums[i];
        }
        boolean dp[][]=new boolean[n][sum+1];

        for(int i=0;i<n;i++) dp[i][0]=true;
        dp[0][nums[0]]=true;

        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                boolean nonPick=dp[i-1][j];
                boolean pick=false;
                if(nums[i]<=j){
                    pick=dp[i-1][j-nums[i]];
                }
                dp[i][j]=pick | nonPick;
            }
        }

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<sum/2;i++){
            if(dp[n-1][i]==true){
                mini=Math.min(mini,Math.abs(i-(sum-i)));
            }
        }
        return mini;
    }
}