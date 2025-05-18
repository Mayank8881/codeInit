class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set2 = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set2.add(nums[j]);
                if(set.size()==set2.size()) {
                    count+=nums.length-j;
                    break;
                }
            }
        }
        return count;
    }
}