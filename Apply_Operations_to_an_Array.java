class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        int count = 0;
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()) {
            if (it.next() == 0) {
                it.remove();
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr.add(0);
        }

        for(int i = 0;i<arr.size();i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}