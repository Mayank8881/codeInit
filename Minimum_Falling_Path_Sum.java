class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            mini=Math.min(mini,paths(n-1,j,matrix));
        }
        return mini;
    }

    public int paths(int i,int j,int arr[][]){
        if(j<0 || j>=arr[0].length) return Integer.MAX_VALUE;
        if(i==0) return arr[i][j];

        int up=paths(i-1,j,arr);
        int left=paths(i-1,j-1,arr);
        int right=paths(i-1,j+1,arr);

        int mini = Math.min(up, Math.min(left, right));
        return (mini == Integer.MAX_VALUE) ? arr[i][j] : arr[i][j] + mini;
    }
}