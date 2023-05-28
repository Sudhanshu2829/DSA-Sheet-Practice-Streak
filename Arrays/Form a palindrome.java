class Solution{
    static int countMin(String str)
    {
        // code here
        int[][] dp = new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++) {
            for(int j=i;j>=0;j--) {
                dp[i][j] = 0;
            }
        }
        for(int i=str.length()-1;i>=0;i--) {
            for(int j=i+1;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1];
                }
                else {
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j-1]) + 1;
                }
            }
        }
        return dp[0][str.length()-1];
    }
}
