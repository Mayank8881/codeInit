class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int v=numCourses;
        int n=prerequisites.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int topo[]=new int[v];
        for(int i=0;i<v;i++){
            for(int neighbor:adj.get(i)){
                topo[neighbor]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(topo[i]==0){
                q.add(i);
            }
        }

        int[] ans=new int[v];
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            ans[i++]=node;
            for(int neighbor:adj.get(node)){
                topo[neighbor]--;
                if(topo[neighbor]==0){
                    q.add(neighbor);
                }
            }
        }

        return i == v ? ans : new int[0];
    }
}