class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            int lSum=0,rSum=0;
            for(int j=0;j<=i;j++){
                lSum+=nums[j];
            }
            for(int k=i+1;k<n;k++){
                rSum+=nums[k];
            }
            if(lSum>=rSum){
                count++;
            }
        } 
        return count;  
    }
}