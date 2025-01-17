class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int i=0;i<derived.length;i++){
            sum=sum^derived[i];
        }
        if(sum!=0){
            return false;
        }
        return true;
    }
}