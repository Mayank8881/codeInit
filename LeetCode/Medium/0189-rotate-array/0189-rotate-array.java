class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int temp=nums[nums.length-1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0]=temp;

            for(int m=0;m<nums.length;m++){
            System.out.print(nums[m]+",");
        }
        System.out.println();
        }
        
    }
}