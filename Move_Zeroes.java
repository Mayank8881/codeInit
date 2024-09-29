class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            
        }
        for(int k=j;k<n;k++){
                nums[k]=0;
        }
    }
}