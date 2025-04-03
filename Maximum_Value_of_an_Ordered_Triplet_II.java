class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxSum=0;
        int n=nums.length;

        int dp[]=new int[n];
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            dp[i]=Math.max(nums[i],dp[i-1]);
        }

        for(int j=1;j<n-1;j++){
            if(dp[j-1]>nums[j]){
                for(int k=j+1;k<n;k++){
                    long sum=((long) dp[j-1]-nums[j])*nums[k];
                    if(sum>maxSum) maxSum=sum;
                }
            }
        }
        return maxSum;        
    }
}