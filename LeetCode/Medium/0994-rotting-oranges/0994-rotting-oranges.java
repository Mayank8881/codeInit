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
        int vis[][]=new int[n][m];   
        Queue<Pair> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
            }
        }

        int time=0;
        int drow[]={-1,0,1,0};
        int dcol[] ={0,1,0,-1};
        while(!queue.isEmpty()){
            int r=queue.peek().row;
            int c=queue.peek().col;
            int t=queue.peek().tm;
            time=Math.max(time,t);
            queue.remove();

            for(int i=0;i<4;i++){
                int row=r+drow[i];
                int col=c+dcol[i];
                if(row>=0 && row<n && col>=0 && col<m && vis[row][col]!=2 && grid[row][col]==1){
                    queue.add(new Pair(row,col,t+1));
                    vis[row][col]=2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=2 && grid[i][j]==1) return -1;
            }
        }
        return time;
    }
}