class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result= new ArrayList<>();
        int[] drow={0,1,0,-1};
        int[] dcol={1,0,-1,0};

        int m=heights.length;
        int n=heights[0].length;
        int[][] visPacific=new int[m][n];
        int[][] visAtlantic=new int[m][n];

        for(int i=0;i<m;i++){
            dfs(heights,visPacific,Integer.MIN_VALUE,i,0,drow,dcol);
        }
        for(int i=0;i<m;i++){
            dfs(heights,visAtlantic,Integer.MIN_VALUE,i,n-1,drow,dcol);
        }

        for(int i=0;i<n;i++){
            dfs(heights,visPacific,Integer.MIN_VALUE,0,i,drow,dcol);
        }

        for(int i=0;i<n;i++){
            dfs(heights,visAtlantic,Integer.MIN_VALUE,m-1,i,drow,dcol);
        }

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visPacific[i][j]==1 && visAtlantic[i][j]==1){
                    result.add(Arrays.asList(i,j));
                }
            }
        }

        return result;
    }

    public void dfs(int[][] heights,int[][] vis,int prevHeight,int r,
         int c,int[] drow,int[] dcol){
        
        int m=heights.length;
        int n=heights[0].length;

        if(r>=0 && r<m && c>=0 && c<n && vis[r][c]==0 && heights[r][c] >= prevHeight){
            vis[r][c]=1;

            for(int i=0;i<4;i++){
                int newRow=r+drow[i];
                int newCol=c+dcol[i];

                dfs(heights,vis,heights[r][c],newRow,newCol,drow,dcol);
            }

        }        
        
    }
}