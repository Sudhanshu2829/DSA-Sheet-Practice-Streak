class Solution
{
    
    public int kthLargest(Node root,int k)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int i = arr.size() -k; 
        return arr.get(i);
    }
    public void inorder(Node root, ArrayList<Integer> arr){
        if(root != null){
            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);
        }
    }
}