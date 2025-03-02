class Solution {
    public int robber(int[] nums) {
        int n=nums.length;
        int prev1=nums[0];
        int prev2=0;

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1){
                pick+=prev2;
            }
            int nonPick=prev1;
            prev2=prev1;
            prev1=Math.max(pick,nonPick);
        }
        return prev1;
    }

    public int rob(int[] nums) {
        int n=nums.length;
        int temp1[]=new int[n-1];
        int temp2[]=new int[n-1];

        for(int i=0;i<n-1;i++){
            temp1[i]=nums[i];
        }
        for(int i=0;i<n-1;i++){
            temp2[i]=nums[i+1];
        }

        return Math.max(robber(temp1),robber(temp2));
    }
}