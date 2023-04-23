class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
       StackNode temp= new StackNode(a);
       temp.next=top;
       top=temp;
       
    }

    int pop() 
    {
    	if(top==null) return-1;
    	
    	int res= top.data;
    	top=top.next;
		return res;

    }
}