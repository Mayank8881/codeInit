class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int start=0;start+2*k <=n;start++){
            if(isIncreasing(nums,start,k) && isIncreasing(nums,start+k,k)){
                return true;
            }
        }
        return false;
    }

    public boolean isIncreasing(List<Integer> nums,int start,int k){
        for(int i=start+1;i<start+k;i++){
            if(nums.get(i)<=nums.get(i-1)) return false;
        }
        return true;
    }
}
