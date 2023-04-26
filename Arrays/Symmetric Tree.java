class GfG
{
    
    static boolean isSym(Node root1,Node root2)
    {
        if(root1==null &&  root2==null)
        {
            return true;
        }
        
        if(root1.data!=root2.data)
        {
            return false;
        }
        
        if(root1.left==null && root1.right==null && root2.left==null && root2.right==null)
        {
            return true;
        }
        
        
        
        if((root1.left==null && root2.right!=null) || (root1.right==null && root2.left!=null)||(root1.left!=null && root2.right==null)||(root1.left!=null && root2.right==null))
        {
          return false;  
        }
        
        return isSym(root1.left,root2.right) && isSym(root1.right,root2.left);
        
    }
    
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null)
        {
            return true;
        }
        
        if(root.left==null && root.right==null)
        {
            return true;
        }
        
        if((root.left==null && root.right!=null)||(root.right==null && root.left!=null))
        {
            return false;
        }
        
      
        return isSym(root.left,root.right);
    }
}