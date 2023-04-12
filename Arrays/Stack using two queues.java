class Queues

{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    int s = q1.size();
	     q1.add(a);
	    for(int i =0;i<s;i++){
	        q1.add(q1.peek());
	        q1.remove();
	    }
	    
	    
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()) return -1;
	    
	   return q1.remove();
    }
	
}