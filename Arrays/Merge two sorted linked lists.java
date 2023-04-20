class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node pre = new Node(0);
        pre.next = head1;
        Node res = pre, p1 = head1, p2 = head2;
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                pre.next = p1;
                p1 = p1.next;
            }
            else {
                pre.next = p2;
                p2 = p2.next;
            }
            pre = pre.next;
        }
        pre.next = p1 != null ? p1 : p2;
        return res.next;
   } 
}