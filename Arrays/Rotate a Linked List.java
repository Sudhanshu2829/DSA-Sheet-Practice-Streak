class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        Node p1 = head, temp = head, p2 = null;
        int size = 0;
        
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        
        p2 = temp;
      
        while(k>0){
            k--;
            temp = p1;
            p2.next = temp;
            p1 = p1.next;
            p2 = p2.next;
        }
            
        p2.next = null;
        
        return p1;
        
    }
}