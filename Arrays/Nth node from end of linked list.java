class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int count = 0;
    	Node runner = head;
    	while(runner != null && count < n -1){
    	    count++;
    	    runner = runner.next;
    	}
    	if(runner == null ){
    	    return -1;
    	}
    	Node prev = null;
    	Node current = head;
    	while(runner != null){
    	    runner = runner.next;
    	    prev = current;
    	    current = current.next;
    	}
    	return prev.data;
    }
}