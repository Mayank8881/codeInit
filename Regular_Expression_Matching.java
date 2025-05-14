class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Boolean[][] dp = new Boolean[n][m];
        return findMatch(s,p,n-1,m-1,dp);
    }

    public boolean findMatch(String s,String p,int i,int j,Boolean[][] dp){
        if (i == 0 && j == 0) return true;
        if (j == 0) return false;
        if (dp[i][j] != null) return dp[i][j];

        boolean match;
        if (j >= 2 && p.charAt(j - 1) == '*') {
            match = findMatch(s, p, i, j - 2, dp) || 
                    (i > 0 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') 
                     && findMatch(s, p, i - 1, j, dp));
        } else {
            match = i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') 
                    && findMatch(s, p, i - 1, j - 1, dp);
        }
        dp[i][j] = match;
        return match;
    }
}