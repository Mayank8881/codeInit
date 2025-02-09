class Solution {
    private void findCombination(int i,int arr[],int target,Set<List<Integer>> ans,List<Integer> ds){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=target){
            ds.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(i+1,arr,target,ans,ds);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> ans=new HashSet<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return new ArrayList<>(ans);
    }
}