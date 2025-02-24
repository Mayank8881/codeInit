class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=-1;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                if(maxIndex<i+1){
                    return false;
                }
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        
        if(maxIndex>=nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}