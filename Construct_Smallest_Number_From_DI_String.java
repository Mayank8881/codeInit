class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        boolean[] used=new boolean[10];
        StringBuilder res=new StringBuilder();
        backtrack(pattern,0,new int[n+1],used,res);
        return res.toString();
    }
    public boolean backtrack(String pattern,int index,int arr[],boolean[] used,StringBuilder res){
        if(index>pattern.length()){
            for(int i=0;i<arr.length;i++){
                res.append(arr[i]);
            }
            return true;
        }

        for(int digit=1;digit<=9;digit++){
            if(!used[digit] && (index=0 || isValid(arr[index-1],digit,pattern.charAt(index-1)))){
                used[digit]=true;
                arr[index]=digit;
                if( backtrack(pattern,index+1,arr,used,res)){
                    return true;
                }
                num[index]=0;
                used[digit]=false;
            }
        }
        return false;
    }

    public boolean isValid(int prev,int current,char condition){
        return (condition == 'I' && prev<current) || (condition == 'D' && prev>current);
    }
}