class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        int[][] res=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=image[i][j];
            }
        }
        q.add(new Pair(sr,sc));
        int val=image[sr][sc];
        res[sr][sc]=color;
        vis[sr][sc]=1;

        int drow[]={-1,0,1,0};
        int dcol[] ={0,1,0,-1};

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;

            for(int i=0;i<4;i++){
                int row=r+drow[i];
                int col=c+dcol[i];

                if(row>=0 && row<n && col>=0 && col<m && image[row][col]==val && vis[row][col]!=1){
                    q.add(new Pair(row,col));
                    res[row][col]=color;
                    vis[row][col] = 1;
                }
            }
        }

        return res;
    }
}