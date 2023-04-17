class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev,curr,temp;
        curr=temp=node;
        prev=null;
        int count=0;
        while(count<k && temp!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        if(temp!=null){
            node.next=reverse(curr,k);
        }
        return prev;
    }
}