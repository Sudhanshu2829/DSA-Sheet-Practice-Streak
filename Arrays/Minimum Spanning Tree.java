class Solution{
    static class Pair{
        int node;
        int weight;
        Pair(int n,int w)
        {
            node=n;
            weight=w;
        }
    }
	static int spanningTree(int V, int E, int edges[][]){
	     ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
	     for(int i=0;i<V;++i)
	     {
	         adj.add(new ArrayList<Pair>());
	     }
	     for(int i=0;i<E;++i)
	     {
	         int u=edges[i][0];
	         int v=edges[i][1];
	         int w=edges[i][2];
	         adj.get(u).add(new Pair(v,w));
	         adj.get(v).add(new Pair(u,w));
	     }
	     boolean[] visited=new boolean[V];
	     PriorityQueue<Pair>pq=new PriorityQueue<Pair>((a,b)->a.weight-b.weight);
	     pq.add(new Pair(0,0));
	     int sum=0;
	     while(!pq.isEmpty())
	     {
	         Pair node=pq.remove();
	         int u=node.node;
	         int wt=node.weight;
	         if(visited[u])
	         {
	             continue;
	         }
	         visited[u]=true;
	         sum+=wt;
	         for(Pair it:adj.get(u))
	         {
	             int v=it.node;
	             if(!visited[v])
	             {
	                 pq.add(it);
	             }
	         }
	     }
	     return sum;
	}
}