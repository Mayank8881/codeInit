class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        int total = (int) Math.pow(2, n);
        String[] binary = new String[total];

        for (int i = 0; i < total; i++) {
            binary[i] = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        Arrays.sort(binary);
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(!nums[i].equals(binary[i])){
                return binary[i].toString();
            }
        }

        return binary[nums.length].toString();
    }
}