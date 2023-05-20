class Solution
{
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();
    public void insertHeap(int x)
    {
        if (max.size() == min.size()) 
        {
            max.offer(x);
        }
        else 
        {
            min.offer(x);
        }
        if (min.size() != 0)
        {    
            balanceHeaps();
        }
    }
    public void balanceHeaps()
    {
       if (max.peek() > min.peek()) 
       {
           int maxpeek = max.poll();
           int minpeek = min.poll();
           max.offer(minpeek);
           min.offer(maxpeek);
       }
    }
    public double getMedian()
    {
        if (max.size() > min.size()) 
        {
            return max.peek();
        }
        else 
        {
            return ((double)(max.peek() + min.peek()))/2;
        }
    }
    
}
