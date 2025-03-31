class Solution {
    public int firstMissingPositive(int[] nums) {
        int num=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num && nums[i]>0){
                num++;
            }
        }
        return num;
    }
}