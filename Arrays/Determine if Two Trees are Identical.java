class Solution
{
	boolean isIdentical(Node root1, Node root2)
	{
	    boolean lResult=false,rResult=false;
	    if(root1==null&&root2==null){
	        return true;
	    }
	    if(root1==null||root2==null){
	        return false;
	    }
	    else if(root1.data!=root2.data){
	        return false;
	    }
	    
	    if(root1.data==root2.data){
	        lResult=isIdentical(root1.left,root2.left);
            rResult=isIdentical(root1.right,root2.right);
	    }   
	    return(lResult && rResult);
	}
}