class Return {
    int min;
    int max;
    int size;
    boolean isBST;
    Return (int min, int max, int size, boolean isBST) {
        this.min = min;
        this.max = max;
        this.size = size;
        this.isBST = isBST;
    }
}
class Solution{
    
    static int max;
    static Return largest(Node root) {
        
        if (root.left == null && root.right == null) {
            max = Math.max(1, max);
            return new Return(root.data, root.data, 1, true);
        }
        
        if (root.left == null) {
            Return right = largest(root.right);
            if (right.isBST && right.min > root.data) {
                max = Math.max(1 + right.size, max);
                return new Return(root.data, right.max, 1 + right.size, true);
            } else {
                return new Return(-1, -1, -1, false);
            }
        }
        
        if (root.right == null) {
            Return left = largest(root.left);
            if (left.isBST && left.max < root.data) {
                max = Math.max(1 + left.size, max);
                return new Return(left.min, root.data, 1 + left.size, true);
            } else {
                return new Return(-1, -1, -1, false);
            }
        }
        
        Return right = largest(root.right);
        Return left = largest(root.left);
        if (left.isBST && left.max < root.data && right.isBST && root.data < right.min) {
            max = Math.max(1 + left.size + right.size, max);
            return new Return(left.min, right.max, 1 + left.size + right.size, true);
        }
        return new Return(-1, -1, -1, false);
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        max = 0;
        largest(root);
        return max;
    }
    
}