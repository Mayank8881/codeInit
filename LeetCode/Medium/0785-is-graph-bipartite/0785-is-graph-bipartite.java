class Solution {
    public boolean isBipartite(int[][] graph) {

        int vis[]=new int[graph.length];

        for(int i=0;i<graph.length;i++){
            vis[i]=-1;
        }
        for(int i=0;i<graph.length;i++){
            if(vis[i]==-1){
                if(! dfs(i,0,vis,graph)) return false;
            }
        }
        return true;

    }

    public boolean dfs(int node,int color,int vis[],int[][] graph){
        vis[node]=color;

        for(int neighbor: graph[node]){
            if(vis[neighbor]==-1){
                if( ! dfs(neighbor,1-color,vis,graph)) return false;
            }
            else if(vis[neighbor]==color) return false;
        }
        return true;
        
    }
}