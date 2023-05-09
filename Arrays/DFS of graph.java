class Solution {
    static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,List<Integer> li){
        vis[node]=true;
        li.add(node);
        
        for(Integer i:adj.get(node)){
          if(vis[i]==false){
              dfs(i,vis,adj,li);
          }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> li=new ArrayList<>();
        boolean visited[]=new boolean[V+1];
        visited[0]=true;
        dfs(0,visited,adj,li);
        
        return li;
    }
}