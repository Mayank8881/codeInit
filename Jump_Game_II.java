class Solution {
    public int minJump(int index,int jump,int[] nums){
        if(index>=nums.length-1)return jump;
        int minJ=Integer.MAX_VALUE;
        for(int i=1;i<=nums[index];i++){
            minJ=Math.min(minJ,minJump(index+i,jump+1,nums));
        }
        return minJ;
    }
    public int jump(int[] nums) {
        return minJump(0,0,nums);
    }
}