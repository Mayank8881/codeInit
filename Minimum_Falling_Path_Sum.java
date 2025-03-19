class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int j=0;j<m;j++){
            dp[0][j]=matrix[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
                int up=matrix[i][j]+dp[i-1][j];
                if(j>0) left=matrix[i][j]+dp[i-1][j-1];
                if(j<m-1) right=matrix[i][j]+dp[i-1][j+1];

                dp[i][j]=Math.min(up,Math.min(left,right));
            }
        }

        int maxi=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            maxi=Math.min(maxi,dp[n-1][j]);
        }
        return maxi;
    }

    public int paths(int i,int j,int arr[][],int dp[][]){
        if(j<0 || j>=arr[0].length) return Integer.MAX_VALUE;
        if(i==0) return arr[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int up=paths(i-1,j,arr,dp);
        int left=paths(i-1,j-1,arr,dp);
        int right=paths(i-1,j+1,arr,dp);

        int minPath = Math.min(up, Math.min(left, right));
        return dp[i][j]=(minPath == Integer.MAX_VALUE) ? arr[i][j] : arr[i][j] + minPath;
    }
}