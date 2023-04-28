class Solution
{
    public static class pair {
    private Node n;
    private int li;

    public pair(Node n, int a) {
        this.n = n;
        this.li = a;
    }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        int min = 0, max = 0;
        pair P = new pair(root,0);
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(P);
        
        while(q.size() > 0){
            int size = q.size();
            while(size-- > 0){
                ArrayList<Integer> li = new ArrayList<>();
                pair p = q.remove();
                Node n = p.n;
                int l = p.li;
                min = Math.min(l,min);
                max = Math.max(l,max);
                if(map.containsKey(l))
                li = map.get(l);
                li.add(n.data);
                map.put(l,li);
                if(n.left != null)  q.add(new pair(n.left,l-1));
                if(n.right != null)  q.add(new pair(n.right,l+1));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
             for(int a : map.get(i))
             ans.add(a);
        }
        
        return ans;
    }
}