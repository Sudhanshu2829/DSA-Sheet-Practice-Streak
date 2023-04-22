class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null)
        {
            return false;
        }
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(temp.next != null)
        {
            list.add(temp.data);
            temp = temp.next;
        }
        list.add(temp.data);
        
        for(int i = 0; i < list.size(); i++ )
        {
            if(list.get(i) != list.get(list.size() - i - 1))
            {
                return false;
            }
        }
        return true;
    }    
}