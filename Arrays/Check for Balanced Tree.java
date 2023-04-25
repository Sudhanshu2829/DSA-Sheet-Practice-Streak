class Tree
{
    int flag = 1;
    int dfs(Node root){
        if (root == null)return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        if (Math.abs(l-r) > 1)flag = 0;
        return Math.max(l, r) + 1;
    }
    boolean isBalanced(Node root){
        dfs(root);
        if (flag == 1)return true;
        return false;
    }
}
