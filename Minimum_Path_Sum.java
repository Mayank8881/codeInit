class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return path(m-1,n-1,grid);
    }

    public int path(int m,int n,int grid[][]){
        if(m==0 && n==0) return grid[m][n];
        if(m<0 || n<0 ) return Integer.MAX_VALUE;
        
        int up=path(m-1,n,grid);
        int left=path(m,n-1,grid);

        return grid[m][n]+Math.min(up,left);
    }
    
}