class Solution {
    public int subsetXORSum(int[] nums) {
        int count=0;
        int mask=1 << nums.length;
        for(int i=0;i<mask;i++){
            int xor=0;
            for(int j=0;j<nums.length;j++){
                if((i & 1 << j) !=0){
                    xor^=nums[j];
                }
            }
            count+=xor;
        }
        return count;
    }
}