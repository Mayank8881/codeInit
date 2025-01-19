class Solution {
    public String largestOddNumber(String num) {
        int sum=0;
        num = num.replaceAll("0+$", "");

        for(int i=num.length()-1;i>=0;i--){
            int c=num.charAt(i);
            int n=c-'0';
            if(n%2!=0){
                num = num.substring(0, i+1);
                break;
            }
            else{
                num = num.substring(0, i);
            }
        }
        return num;
        
    }
}