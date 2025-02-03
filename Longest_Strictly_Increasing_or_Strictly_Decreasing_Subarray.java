class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1,maxCount=1,count2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                count2=0;
            }
            else if(nums[i]>nums[i+1]){
                count2++;
                count=0;
            }
            else{
                count=0;
                count2=0;
            }
            maxCount=Math.max(Math.max(count,count2),maxCount);

        }
        return maxCount;
    }
}