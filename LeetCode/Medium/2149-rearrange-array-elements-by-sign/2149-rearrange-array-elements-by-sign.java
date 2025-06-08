class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg.add(nums[i]);
            else pos.add(nums[i]);
        }
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos.get(j);
                j++;
            }
            else{
                nums[i]=neg.get(k);
                k++;
            }      
        }
        return nums;
    }
}