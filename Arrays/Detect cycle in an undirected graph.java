class pair{
    int first;
    int sec;
    pair(int first,int sec){
        this.first=first;
        this.sec=sec;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(dfs(i,adj,visited,-1)) return true;
            }
        }
        return false;
    }
    public boolean dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent)
    {
        vis[V]=true;
        for(Integer neighbour: adj.get(V)){
            if(!vis[neighbour]){
                if(dfs(neighbour, adj, vis, V))return true;
            }else if(parent!=neighbour){
                return true;
            }
        }
        return false;
    }
}