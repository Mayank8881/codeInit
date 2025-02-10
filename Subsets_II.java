class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        backtrack(0,nums,result,new ArrayList<>());
        return result;
    }

    private void backtrack(int s,int arr[],List<List<Integer>> list,List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int i=s;i<arr.length;i++){
            if(i>s && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            backtrack(i+1,arr,list,ds);
            ds.remove(ds.size()-1);
        }
    }

}