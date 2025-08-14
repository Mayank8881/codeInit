class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> queue=new LinkedList<>();

        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        //left right
        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && vis[i][0]!=1){
                queue.add(new Pair(i,0));
                vis[i][0]=1;
            }
            if(grid[i][m-1]==1 && vis[i][m-1]==0){
                queue.add(new Pair(i,m-1));
                vis[i][m-1]=1;
            }
        }

        //top bottom
        for(int j=0;j<m;j++){
            if(grid[0][j]==1 && vis[0][j]!=1){
                queue.add(new Pair(0,j));
                vis[0][j]=1;
            }
            if(grid[n-1][j]==1 && vis[n-1][j]==0){
                queue.add(new Pair(n-1,j));
                vis[n-1][j]=1;
            }
        }

        while(!queue.isEmpty()){
            int r=queue.peek().row;
            int c=queue.peek().col;

            queue.remove();

            for(int i=0;i<4;i++){
                int row=r+drow[i];
                int col=c+dcol[i];

                if(row>=0 && row<n-1 && col>=0 && col<m-1 && vis[row][col]!=1 && grid[row][col]==1){
                    queue.add(new Pair(row,col));
                    vis[row][col]=1;
                }
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }

    // public void dfs(int r,int c,int grid[][],int vis[][],int drow[],int dcol[]){
    //     int n=grid.length;
    //     int m=grid[0].length;
    //     vis[r][c]=1;

    //     for(int i=0;i<4;i++){
    //         int row=r+drow[i];
    //         int col=c+dcol[i];
    //         if(row>=0 && row<n-1 && col>=0 && col<m-1 && vis[row][col]!=1 && grid[row][col]==1){
    //             dfs(row,col,grid,vis,drow,dcol);
    //         }
    //     }
    // }
}