class Pair{
    int row,col;
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
        int[][] res=new int[n][m];

        int[][] vis=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=image[i][j];
            }
        }
        int clr=res[sr][sc];
        q.add(new Pair(sr,sc));
        res[sr][sc]=color;
        vis[sr][sc]=1;
        
        int[] drow={0,1,0,-1};
        int[] dcol={1,0,-1,0};


        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.remove();

            for(int i=0;i<4;i++){
                int newRow=r+drow[i];
                int newCol=c+dcol[i];

                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && vis[newRow][newCol]!=1 && 
                    res[newRow][newCol]==clr){
                        q.add(new Pair(newRow,newCol));
                        res[newRow][newCol]=color;
                        vis[newRow][newCol]=1;
                }

            }

        }
        return res;

    }
}