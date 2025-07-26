class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        int r=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            r++;
        }
        return count;
    }
}