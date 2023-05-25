class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] dp = new int[n+1][W+1];
        //  Arrays.fill(dp,-1);
        for(int i=0;i<dp.length;i++){
            for(int j=0; j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
         return dynamic(W,wt,val,n,dp);

    } 
    static int dynamic(int W, int wt[], int val[], int n,int[][] dp){
        if(W==0 || n==0){
             return 0;
         }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
         if(wt[n-1]<=W){
             return dp[n][W]=Math.max(val[n-1]+dynamic(W-wt[n-1], wt, val, n-1,dp),dynamic(W, wt, val, n-1,dp));
         }else{
             //exclude
             return dp[n][W]=dynamic(W, wt, val, n-1,dp);
         }
    }
    
}
