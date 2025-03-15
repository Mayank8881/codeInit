class Solution {
    public int minCapability(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i : nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        int start=min;
        int end=max;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isRobbery(mid,nums,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public boolean isRobbery(int cap,int nums[],int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=cap){
                count++;
                i++;
            }
            if(count>=k){
                return true;
            }
        }
        return false;
    }
}