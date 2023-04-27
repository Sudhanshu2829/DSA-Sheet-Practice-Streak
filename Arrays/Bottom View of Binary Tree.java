class Solution
{
     static class Pair{
        Node node;
        int h_idx=0;
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
       TreeMap<Integer,Node> m=new TreeMap<>();
        ArrayList<Integer> out=new ArrayList<Integer>();
        if(root==null)
            return out;
        Queue<Pair> q=new LinkedList<>();
        Pair p=new Pair();
        p.node=root;
        p.h_idx=0;
        q.offer(p);
        while(q.size()>0){
            Pair p1=q.poll();

                m.put(p1.h_idx,p1.node);
            
            if(p1.node.left!=null){
                Pair p2=new Pair();
               p2.node=p1.node.left;
               p2.h_idx=p1.h_idx-1;
                q.offer(p2);
            }
            if(p1.node.right!=null){
                Pair p2=new Pair();
               p2.node=p1.node.right;
               p2.h_idx=p1.h_idx+1;
                q.offer(p2);
            }
        }
        for (Map.Entry<Integer,Node> entry : m.entrySet())
            out.add(entry.getValue().data);
        return out;
    }
}