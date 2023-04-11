

class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        long[] prev;
        long[] next;
        prev=getPrev(hist, n);
        next=getNext(hist, n);
        long maxArea=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            long length=hist[i];
            if(next[i]==-1) next[i]=n;
            long breadth=next[i]-prev[i]-1;
            long area=length*breadth;
            maxArea=Math.max(maxArea, area);
        } 
        return maxArea;
        
    }
    static long[] getPrev(long[] arr, long n) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        long[] ans=new long[(int)n];
        for(int i=0; i<n; i++) {
            long curr=arr[i];
            while(stack.peek()!=-1 && arr[stack.peek()]>=curr) {
                stack.pop();
            }
            ans[i]=stack.peek();
            stack.push(i);
        }
        return ans;
    }
    
    static long[] getNext(long[] arr, long n) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        long[] ans=new long[(int)n];
        for(int i=(int)n-1; i>=0; i--) {
            long curr=arr[i];
            while(stack.peek()!=-1 && arr[stack.peek()]>=curr) {
                stack.pop();
            }
            ans[i]=stack.peek();
            stack.push(i);
        }
        return ans;
    }    
}

