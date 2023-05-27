class Solution {
    public long count(int coins[], int N, int sum) {
        long [][] dp = new long[N][sum+1];
        for(long[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return solve(coins,N-1,sum,dp);
    }
    public long solve(int[] arr , int n , int sum , long[][] dp)
    {
        if(n==0)
        {
            return sum%arr[n]==0?1:0;
        }
        if(dp[n][sum]!=-1)
        {
            return dp[n][sum];
        }
        long not = solve(arr,n-1,sum,dp);
        
        long take=0;
        if(sum>=arr[n])
        {
            take=solve(arr,n,sum-arr[n],dp);
        }
        return dp[n][sum]=take+not;
    }
}
