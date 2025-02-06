class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> p=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prod=nums[i]*nums[j];
                p.put(prod,p.getOrDefault(prod,0)+1);
            }
        }
        int result=0;
        for(int count:p.values()){
            if(count>1){
                result+=count*(count-1)*4;
            }
        }
        return result;
    }
}