class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer>al=new ArrayList<>();
        PriorityQueue<Integer>pque=new PriorityQueue<>(5,Collections.reverseOrder());

        for(int i=0;i<k;i++)
        {
            pque.add(arr[i]);
        }
        al.add(pque.peek());
        for(int i=1;i+k-1<n;i++)
        {
            pque.remove(arr[i-1]);
            pque.add(arr[i+k-1]);
            al.add(pque.peek());
        }
        return al;
    }
}