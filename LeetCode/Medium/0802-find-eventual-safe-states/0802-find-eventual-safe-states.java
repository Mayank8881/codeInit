class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v=graph.length;
        ArrayList<ArrayList<Integer>> adjRev=new ArrayList<>();
        int indegree[]=new int[v];

        for(int i=0;i<v;i++){
            adjRev.add(new ArrayList<>());
        }

        //reverse adj list
        for(int i=0;i<v;i++){
            for(int neighbor:graph[i]){
                adjRev.get(neighbor).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        ArrayList<Integer> res=new ArrayList<>();

        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            res.add(node);
            
            for(int neighbor:adjRev.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0) q.add(neighbor);
            }
        }
        Collections.sort(res);
        return res;
    }
}