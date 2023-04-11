

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> st = new Stack<>();
        long nger[] = new long[n];
        
        //we have to traverse rom right ot left
        for(int i = n-1; i >= 0; i--)
        {
            //do we have a people in stack
            //if there are people ,are they big enough to be mine next greater element on right
            // if not remove them
            
            while(st.size() > 0 && st.peek() <= arr[i])
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                nger[i] = -1;
            }
            else {
                nger[i] = st.peek();
            }
            st.push(arr[i]);
        }
        
        return nger;
    } 
}