class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : nums) {
            if(map.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}