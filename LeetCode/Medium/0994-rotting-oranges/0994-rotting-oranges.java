class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }


        int[] drow={0,1,0,-1};
        int[] dcol={1,0,-1,0};

        int time=0;

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;

            q.remove();
            
            time=Math.max(time,t);

            for(int i=0;i<4;i++){
                int newRow=r+drow[i];
                int newCol=c+dcol[i];

                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && grid[newRow][newCol]==1 && 
                    vis[newRow][newCol]==0) {

                        vis[newRow][newCol]=1;
                        q.add(new Pair(newRow,newCol,t+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=1 && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}