class Solution {
    public int maxScore(String s) {
        int l=0,r=0,maxSum=0;
        
        while(r<s.length()){
            int count0=0,count1=0,sum=0,tSum=0;
            for(int i=l;i<=r;i++){
                if(s.charAt(i)=='0'){
                    count0++;
                }
                if(count0==s.length()){
                    return 1;
                }
            }

            for(int j=r+1;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count1++;
                }
                if(count1==s.length()){
                    return 1;
                }
            }

            tSum=count0+count1;
            // System.out.println(count);
            maxSum=Math.max(tSum,maxSum);
            r++;
        }
        return maxSum;
    }
}