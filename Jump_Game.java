class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        for(int i=0;i<nums.length-1;i++){
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        if(maxIndex>=nums[nums.length-1]){
            return true;
        }
        else{
            return false;
        }
    }
}