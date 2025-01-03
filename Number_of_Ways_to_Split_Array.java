class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int count=0;
        long totalSum=0,lSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            lSum+=nums[i];
            if(lSum>=(totalSum-lSum)){
                count++;
            }
        } 
        return count;  
    }
}