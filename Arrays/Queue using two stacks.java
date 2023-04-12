class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
    int Pop()
    {
        if(s1.size() == 0)return -1;
	   // Your code here
	   while(s1.size() != 1){
	       int tmp = s1.peek();
	       s1.pop();
	       s2.push(tmp);
	  }
	   
	   int elm = s1.peek();
	   s1.pop();
	   
	   while(s2.size()!=0){
	       int tmp = s2.peek();
	       s2.pop();
	       s1.push(tmp);
	   }
	   
	   return elm;
	   
    }
}
