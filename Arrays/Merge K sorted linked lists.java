class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node temp=null;
        for(Node i:arr){
            temp=mergeTwoLists(temp,i);
        }
        return temp;
        
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        Node head= new Node(5);
        Node temp=head;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }else{
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null)temp.next=list1;
        if(list2!=null)temp.next=list2;
        return head.next;
    }
}