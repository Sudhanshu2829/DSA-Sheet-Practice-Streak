class Solution
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        boolean[] vis = new boolean[adj.size()];
        int[] dist = new int[adj.size()];
        
        for(int i =0; i< dist.length; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[S] = 0;
        Pair p = new Pair(S,dist[S]);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(p);
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(vis[curr.node] != true){
                vis[curr.node] = true;
                for(int i =0; i< adj.get(curr.node).size(); i++){
                    int neighbour = adj.get(curr.node).get(i).get(0);
                    int weight  = adj.get(curr.node).get(i).get(1);
                    if(dist[neighbour] > dist[curr.node] + weight){
                        dist[neighbour] = dist[curr.node] + weight;
                    }
                    pq.add(new Pair(neighbour, dist[neighbour]));
                }
            }
        }
        return dist;
        
        
        
    }
}
public class Pair implements Comparable<Pair>{
    int node;
    int dist;
    
    public Pair(int node, int dist){
        this.node = node;
        this.dist = dist;
    }
    
    @Override
    public int compareTo(Pair p2){
        return this.dist - p2.dist;
    }
}