class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        return partition(nums,sum/2,n-1);
    }

    public boolean partition(int nums[],int sum,int i){
        if(sum==0) return true;
        if(i==0) return nums[i]==sum;

        boolean nonPick=partition(nums,sum,i-1);
        boolean pick=false;
        if(nums[i]<=sum){
            pick=partition(nums,sum-nums[i],i-1);
        }
        return pick | nonPick;
    }
}