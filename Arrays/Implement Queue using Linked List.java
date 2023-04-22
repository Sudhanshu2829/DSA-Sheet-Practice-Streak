class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode n = new QueueNode(a);

        if(front == null){
            front = rear = n;
            return;
        }

        rear.next = n;
        rear = n;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null){
            return -1;
        }
        int temp = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return temp;
	}
}