class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        boolean visited[] = new boolean[V];
        visited[0] = true;
        while(!q.isEmpty()){
            int val = (int)q.poll();
            ans.add(val);
            for(int i = 0;i<adj.get(val).size();i++){
                if(visited[adj.get(val).get(i)]==false){
                    q.add(adj.get(val).get(i));
                    visited[adj.get(val).get(i)] = true;
                }
            }
        }
        return ans;
    }
}