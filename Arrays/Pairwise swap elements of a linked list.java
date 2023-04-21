class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
       if(head==null||head.next==null){
           return head;
       }
       Node uf=head.next;
       Node p=head;
       
       Node prev=new Node(10);
       while(p!=null && p.next!=null){
           Node temp=p.next;
           Node temp2=p.next.next;
           temp.next=p;
           p.next=temp2;
           prev.next=temp;
           prev=p;
           p=temp2;
       }
       return uf;
        
    }
}