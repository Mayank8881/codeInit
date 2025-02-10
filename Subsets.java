class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        // for(int i=0;i<(1<<nums.length);i++){
        //     List<Integer> list=new ArrayList<>();
        //     for(int j=0;j<nums.length;j++){
        //         if((i & (1<<j)) !=0){
        //             list.add(nums[j]);
        //         }
        //     }
        //     result.add(list);
        // }
        // Arrays.sort(nums);
        backtrack(0,nums,result,new ArrayList<>());
        return result;
    }

    private void backtrack(int s,int arr[],List<List<Integer>> list,List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int i=s;i<arr.length;i++){
            ds.add(arr[i]);
            backtrack(i+1,arr,list,ds);
            ds.remove(ds.size()-1);
        }
    }

}