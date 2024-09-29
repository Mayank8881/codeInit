class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=1;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            
        }
        return null;
    }
}