class Solution {
    public boolean checkCycle(ArrayList<ArrayList<Integer>> adj,int i ,boolean visited[],boolean parent[]) {
        visited[i] = true;
        parent[i] = true;
        for(int j : adj.get(i)) {
            
            if(visited[j] == false) {
                if(checkCycle(adj,j,visited,parent))
                    return true;
            } else {
                if(parent[j])   
                    return true;
            }
        }
        parent[i] = false;
        return false;
    }
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean visited[] = new boolean[v];   
        boolean parent[] = new boolean[v];
        
        for(int i=0;i<v;i++) {
            
            if(visited[i] == false) {
                if(checkCycle(adj,i,visited,parent))
                    return true;
            }
            
        }
        return false;
    }
}