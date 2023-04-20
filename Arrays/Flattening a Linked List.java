class GfG
{
    Node flatten(Node root)
    {
	if(root==null || root.next==null) return root;
	 root.next=flatten(root.next);
	 root=merge(root,root.next);
	 return root;
    }
    
    Node merge(Node head1,Node head2){
        Node result=new Node(-1);
        Node temp=result;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.bottom=head1;
                head1=head1.bottom;
                temp=temp.bottom;
            }else{
                temp.bottom=head2;
                head2=head2.bottom;
                temp=temp.bottom;
            }
        }
        
        if(head1!=null)
        temp.bottom=head1;
        
        if(head2!=null)
        temp.bottom=head2;
        
        result=result.bottom;
        result.next=null;
        return result;
    }
}