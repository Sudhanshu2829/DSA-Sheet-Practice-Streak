class Solution
{
    int maxPathSum(Node root)
    { 
        // code here 
        int level = 0;
        ans(root,level);
        return ans;
    } 
    int ans = Integer.MIN_VALUE;
    
    int ans(Node root,int level){
        if(root == null)
            return 0;
        if(root.left==null&root.right==null)
            return root.data;
            
        
        
        int l = ans(root.left,level+1);
        int r = ans(root.right,level+1);
        
        
        if(root.left == null){
            if(level ==0){
            ans = Math.max(root.data+r,ans);
        }
            return root.data+r;
        }
        if(root.right == null){
            
            if(level ==0){
            ans = Math.max(root.data+l,ans);
        }
            return root.data+l;
            
        }
        
        ans = Math.max(ans,l+r+root.data);
        return Math.max(l+root.data,root.data+r);
    }
}