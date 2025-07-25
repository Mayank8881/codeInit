class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int min=Integer.MIN_VALUE;

        for(int num:nums){
            if(!set.contains(num)){
                if(num>=0){
                    sum+=num;
                }
                else{
                    min=Math.max(min,num);
                }
            }

            set.add(num);
        }

        if(sum==0 && !set.contains(0)){
            return min;
        }
        return sum;
    }
}