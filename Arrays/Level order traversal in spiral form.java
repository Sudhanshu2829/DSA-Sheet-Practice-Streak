class Spiral
{
    ArrayList<Integer> findSpiral(Node root)
    {
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return temp;
        Stack<Node> S1 = new Stack<>();
        Stack<Node> S2 = new Stack<>();
        S1.push(root);
        while(!S1.isEmpty() || !S2.isEmpty()){
            
            while(!S1.isEmpty()){
                Node out = S1.pop();
                temp.add(out.data);
                if (out.right!= null){
                    S2.push(out.right);   
                }
               if (out.left!= null){
                    S2.push(out.left);   
                }
            }
            while(!S2.isEmpty()){
                Node out = S2.pop();
                temp.add(out.data);
                if (out.left!= null){
                    S1.push(out.left);   
                }  if (out.right!= null){
                    S1.push(out.right);   
                }
            }
            
        }
        return temp;
    }
}