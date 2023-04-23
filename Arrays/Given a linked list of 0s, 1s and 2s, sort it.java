class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int cnt0=0,cnt1=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==0)cnt0++;
            else if(temp.data==1)cnt1++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(cnt0>0)
            {
                temp.data=0;
                cnt0--;
            }
            else if(cnt1>0)
            {
                temp.data=1;
                cnt1--;
            }
            else
            temp.data=2;
            temp=temp.next;
        }
        return head;
        // add your code here
    }
}
