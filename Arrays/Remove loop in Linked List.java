class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return;
        }
        slow =head;
// if loop are present at head//
        if(slow==fast){
            while(fast.next!=slow){
                fast=fast.next;
            }
            fast.next=null;
        }
//else
        else{
        while(slow.next!=fast.next){
            slow=slow.next;
            fast = fast.next;
        }
        fast.next=null;
        }  
    }
}
    