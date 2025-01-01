class Solution {
    public int maxScore(String s) {
        int l=0,r=0,maxSum=0;
        while(r<s.length()){
            int count=0,sum=0,tSum=0;
            for(int i=l;i<=r;i++){
                if(s.charAt(i)=='0'){
                    count++;
                }
            }

            for(int j=r+1;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }

            // tSum=sum+count;
            // System.out.println(count);
            maxSum=Math.max(count,maxSum);
            r++;
        }
        return maxSum;
    }
}