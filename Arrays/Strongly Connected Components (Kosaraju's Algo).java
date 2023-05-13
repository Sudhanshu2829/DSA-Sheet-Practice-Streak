class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> st=new Stack<>();
        ArrayList<ArrayList<Integer>> adjTrans=new ArrayList<>();
        boolean[] vis=new boolean[V];
        //sorting nodes wrt their finishing time inside a stack
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfsFinishTime(i,vis,st,adj);
            }
        }
        //intialising adj list of reversed graph
        for(int i=0;i<V;i++){
            adjTrans.add(new ArrayList<>());
        }
        //reversing the graph
        for(int i=0;i<V;i++){
            vis[i]=false; //resetting the vis array since we have to use it again in another dfs to find the number of SCCs
            for(int adjNode:adj.get(i)){
                adjTrans.get(adjNode).add(i);
            }
        }
        //finding SCC count
        int scc=0;
        while(!st.isEmpty()){
            int i=st.pop();
            if(!vis[i]){
                dfsCountSCC(i,vis,adjTrans);
                scc++;
            }
        }
        return scc;
    }
    //dfs to sort the nodes acc to their finish time
    public void dfsFinishTime(int node, boolean[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfsFinishTime(i,vis,st,adj);
            }
        }
        st.push(node);
    }
    //dfs to find the number of SCCs
    public void dfsCountSCC(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjTrans){
        vis[node]=true;
        for(int i:adjTrans.get(node)){
            if(!vis[i]){
                dfsCountSCC(i,vis,adjTrans);
            }
        }
    }
}