class Tree {
    // Function to return the ceil of given number in BST.
    int ans=Integer.MAX_VALUE;
    int count=0;
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        if(root.data==key||(root.data>key&&root.data<ans)){
            ans=root.data;
            count++;
        }
        findCeil(root.left,key);
        findCeil(root.right,key);
        if(count==0){
            return -1;
        }
        return ans;
    }
}