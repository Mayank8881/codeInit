class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Boolean[][] dp = new Boolean[n][m];
        return findMatch(s,p,n-1,m-1,dp);
    }

    public boolean findMatch(String s,String p,int i,int j,Boolean[][] dp){

        if(i<0 && j<0) return true;
        if(j<0 && i>=0) return false;
        if(i<0 && j>=0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }

        if(dp[i][j]!=null ) return dp[i][j];

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            dp[i][j]=findMatch(s,p,i-1,j-1,dp);
        }
        else if(p.charAt(j)=='*'){
            dp[i][j]= findMatch(s,p,i,j-1,dp) || findMatch(s,p,i-1,j,dp);
        }
        else{
            dp[i][j]=false;
        }
        return dp[i][j];
    }
}