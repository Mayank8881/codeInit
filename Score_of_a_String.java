class Solution {
    public int scoreOfString(String s) {
        int t_sum=0;
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            int cc=(int) c;
            int dd=(int) d;
            int sum=Math.abs(cc-dd);
            t_sum=t_sum+sum;
        }
        return t_sum;
        
    
}
}