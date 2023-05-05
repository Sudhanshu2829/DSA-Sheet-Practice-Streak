class Solution 
{
    public static int maxMeetings(int start[], int end[], int n)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>
       ((a,b) -> (a[2] == b[2])? a[0] - b[0]: a[2] - b[2]);
           
       for(int i=0; i<n; i++) 
           pq.add(new int[] { i+1, start[i], end[i] });
           
       int count = 0, limit = 0;
           
       while(!pq.isEmpty()) {
           int[] cur = pq.poll();
           if(cur[1] > limit) {
               count++;
               limit = cur[2];
           }
       }
           
       return count;
    }
}