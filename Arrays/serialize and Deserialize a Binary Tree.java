class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root == null){
	        return;
	    }
	    serialize(root.left, A);
	    A.add(root.data);
	    serialize(root.right, A);
	}
	
	//Function to deserialize a list and construct the tree.
	public Node deSerialize(ArrayList<Integer> A)
    {
        Node root = null;
        if(A.size() == 0){
            return root;
        }
        root = deSerializee(A);
        return root;
    } 
    public Node deSerializee(ArrayList<Integer> A)
    {
        if(A.size() == 0){
            return null;
        }
        Node root = new Node(A.get(0));
        A.remove(0);
        root.right = deSerializee(A);
        root.left = deSerialize(A);
        return root;
    }
};