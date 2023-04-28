class Solution {
    static class Info{
        int dia;
        int height;
        Info(int dia , int height){
            this.dia = dia;
            this.height= height;
        }
    }
    
    Info diam(Node root) {
        if(root==null){
            return new Info(0,0);
        }
        Info left= diam(root.left);
        Info right= diam(root.right);
        
        int diameter=Math.max(left.height+right.height+1,Math.max(left.dia, right.dia));
        int height=Math.max(left.height,right.height)+1;
        return new Info(diameter, height);
    }
    int diameter(Node root){
        int d=diam(root).dia;
        return d;
    }
}