class Tree
{   
    void leftview(Node root,ArrayList list,int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.data);
        }
        leftview(root.left,list,level+1);
        leftview(root.right,list,level+1);
    }
    
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> list=new ArrayList<>();
      leftview(root,list,0);
      return list;
    }
}