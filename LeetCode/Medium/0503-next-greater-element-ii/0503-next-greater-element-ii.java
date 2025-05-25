class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        Arrays.fill(res,-1);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+n;j++){
                int idx=j%n;
                if(nums[idx]>nums[i]){
                    res[i]=nums[idx];
                    break;
                }
            }
        }

        return res;
    }
}