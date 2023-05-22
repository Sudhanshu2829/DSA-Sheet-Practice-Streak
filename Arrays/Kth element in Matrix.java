class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                pq.add(mat[i][j]);
                if(pq.size() > k){
                    pq.remove();
                }
            }
        }
        return pq.peek();
    }
}