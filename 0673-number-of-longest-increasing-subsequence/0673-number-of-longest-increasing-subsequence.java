class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int count[]=new int[nums.length];

        int maxi=1;
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            count[i]=1;
            for(int prev=0;prev<i;prev++){
                if(nums[prev]<nums[i] && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                    count[i]=count[prev];
                }
                else if(nums[prev]<nums[i] && 1+dp[prev]==dp[i]){
                    count[i]+=count[prev];
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }

        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==maxi){
                cnt+=count[i];
            }
        }
        return cnt;
    }
}