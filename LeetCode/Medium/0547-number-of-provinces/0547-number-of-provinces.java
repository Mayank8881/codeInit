class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }

    public void dfs(int node,int [][] isConnected,boolean vis[]){
        vis[node]=true;
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            if(isConnected[node][i] ==1 && !vis[i]){
                dfs(i,isConnected,vis);
            }
        }
    }
}