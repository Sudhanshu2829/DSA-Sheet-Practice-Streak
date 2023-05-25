class Solution
{
	public int maxSumIS(int arr[], int n)  
	{
	   int max = 0;
	   int[] dp = new int[arr.length + 1];
	    for(int i = arr.length - 1; i >= 0; i--)
	    max = Math.max(max, r(arr, i, dp));
	    return max;
	}  
	
	public int r(int[] a, int i, int[] dp)
	{
	    int max = a[i];
	    if( dp[i] != 0)
	      return dp[i];
	    for(int i1 = i - 1; i1 >= 0; i1--)                                         
	    {
	        if(a[i] > a[i1])
	        {
	            max = Math.max(max, a[i] + r(a, i1, dp)) ;
	        }
	    }
	    return dp[i] = max;
	}
}
