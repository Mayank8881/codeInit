class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            int l=nums[i],s=nums[i];
            for(int j=i+1;j<n;j++){
                l=Math.max(l,nums[j]);
                s=Math.min(s,nums[j]);

                sum+=(long)l-s;

            }
        }
        return sum;
    }
}