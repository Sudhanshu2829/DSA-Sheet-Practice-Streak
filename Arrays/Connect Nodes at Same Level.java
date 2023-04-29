class Solution {
    //Function to connect nodes at same level.
    public void connect(Node root) {
        Queue<Node> que = new LinkedList<> ();
        
        que.add(root);
        
        while(que.isEmpty() == false) {
            int size = que.size();
            
            while(size > 0) {
                Node temp = que.remove();
                if(size > 1) 
                    temp.nextRight = que.peek();
                
                if(temp.left != null)
                    que.add(temp.left);
                if(temp.right != null)
                    que.add(temp.right);
                
                size--;
            }
            
        }
        
    }
}