class Pair{
    int row;
    int col;
    int t;
    Pair(int row,int col,int t){
        this.row=row;
        this.col=col;
        this.t=t;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair> q=new LinkedList<>();
        int res[][]=new int[n][m];
        int[][] vis=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=mat[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(res[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }

        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().t;

            q.remove();
            res[r][c]=t;

            for(int i=0;i<4;i++){
                int row=r+drow[i];
                int col=c+dcol[i];

                if(row>=0 && row<n && col>=0  && col<m && vis[row][col]!=1){
                    q.add(new Pair(row,col,t+1));
                    vis[row][col]=1;
                }
            }
        }
        return res;
    }
}