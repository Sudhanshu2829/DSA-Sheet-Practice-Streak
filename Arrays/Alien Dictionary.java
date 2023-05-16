class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        Graph graph=new Graph(K);
        
        for(int i=0;i<N-1;i++){
            for(int k=0;k<Math.min(dict[i].length(),dict[i+1].length());k++){
                if(dict[i].charAt(k)!=dict[i+1].charAt(k)){
                  //  System.out.println(dict[i].charAt(k)+" "+dict[i+1].charAt(k)+" "+dict[i]+" "+dict[i+1]);
                    graph.addEdge(dict[i].charAt(k)-'a',dict[i+1].charAt(k)-'a');
                    break;
                }
            }
        }
        String res=graph.topologicalSort();
       // System.out.println(res);
        return res;
    }
}

class Graph{
    int V;
    private final LinkedList<Integer>[] adj;
    
    Graph(int v){
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    
    public void addEdge(int src,int des){
        adj[src].add(des);
    }
    
    public void topologicalSortUtil(Stack<Integer> stack,boolean[] visited,int idx){
        visited[idx]=true;
        for(Integer i:adj[idx]){
            if(!visited[i]){
                topologicalSortUtil(stack,visited,i);
            }
        }
        stack.push(idx);
    }
    
    public String topologicalSort(){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0; i<V; i++){
            if(!visited[i]){
                topologicalSortUtil(stack,visited,i);
            }
        }
        String res="";
        while(!stack.isEmpty()){
            int d=stack.pop();
           // System.out.print((char)('a' + d)
           //                  + " ");
            res+=(char)(d+'a')+"";
        }
        return res;
    }
}
