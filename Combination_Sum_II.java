class Solution {
    // private void findCombination(int i,int arr[],int target,Set<List<Integer>> ans,List<Integer> ds){
    //     if(i==arr.length){
    //         if(target==0){
    //             ans.add(new ArrayList<>(ds));
    //         }
    //         return;
    //     }
    //     if(arr[i]<=target){
    //         ds.add(arr[i]);
    //         findCombination(i+1,arr,target-arr[i],ans,ds);
    //         ds.remove(ds.size()-1);
    //     }
    //     findCombination(i+1,arr,target,ans,ds);
    // }
    private void findCombination(int i,int arr[],int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        
        for(int idx=i;idx<arr.length;idx++){
            if(idx>i && arr[idx]==arr[idx-1]){
                continue;
            }
            if(arr[idx]>target){
                break;
            }
            ds.add(arr[idx]);
            findCombination(idx+1,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}