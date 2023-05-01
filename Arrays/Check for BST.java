public class Solution
{
    boolean isBST(Node root)
    {
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean isBstUtil(Node root, int min, int max){
        if(root == null) return true;
        if(root.data <= min || root.data >=max) return false;
        
        return isBstUtil(root.left, min, root.data) && isBstUtil(root.right, root.data, max);
    }
}