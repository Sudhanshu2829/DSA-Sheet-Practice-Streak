class Solution
{
    Node prev;
    Node bToDLL(Node root)
    {
        if(root == null)
            return root;
        
        Node head = bToDLL(root.left);
        
        if(prev==null)
            head = root;
        else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        
        bToDLL(root.right);
        
        return head;
    }
}