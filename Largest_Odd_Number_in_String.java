class Solution {
    public String largestOddNumber(String num) {
        char c=num.charAt(num.length()-1);
        int n=c-'0';
        int sum=0;
        if(n%2!=0){
            return num;
        }
        else{
            for(int i=num.length()-2;i>=0;i--){
                char ch=num.charAt(i);
                int nn=ch-'0';
                if(nn%2!=0){
                   if(nn>sum){
                    sum=nn;
                   }
                }
            }
            if(sum==0){
                return "";
            }
            else{
                return String.valueOf(sum);
            }
            
        }
        
    }
}