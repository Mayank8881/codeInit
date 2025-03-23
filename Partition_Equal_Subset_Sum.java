class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        Boolean dp[][]=new Boolean[n][sum/2+1];

        if(sum%2!=0) return false;
        return partition(nums,sum/2,n-1,dp);
    }

    public boolean partition(int nums[],int sum,int i,Boolean[][] dp){
        if(sum==0) return true;
        if(i==0) return nums[i]==sum;
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean nonPick=partition(nums,sum,i-1,dp);
        boolean pick=false;
        if(nums[i]<=sum){
            pick=partition(nums,sum-nums[i],i-1,dp);
        }
        return dp[i][sum]= (pick | nonPick);
    }
}