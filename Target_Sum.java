class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++) total+=nums[i];
        if(total-target<0 || (total-target)%2!=0)  return 0;

        int sum = (total - target) / 2;
        int dp[][]=new int[nums.length][sum+1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return path(nums, sum, nums.length - 1, dp);
    }

    private int path(int nums[],int target,int i,int dp[][]){
        if(i==0){
            if(target==0 && nums[0]==0) return 2;
            if(target==0 || target==nums[0]) return 1;
            return 0;
        }

        if(dp[i][target]!=-1) return dp[i][target];

        int notPick=path(nums,target,i-1,dp);
        int pick=0;
        if(nums[i]<=target) pick=path(nums,target-nums[i],i-1,dp);

        return dp[i][target]=(pick+notPick);
    }

}