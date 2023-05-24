class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int nums[])
    {
        // code here int n = nums.length;
        int[] dp = new int[n];
        int len = 1;
        dp[0] = nums[0];
        int j = 1;
        for(int i=1;i<n;i++ ){
            if(nums[i] > dp[len-1]){
                dp[len] = nums[i];
                len++;
            }else{
                BS(dp, 0, len-1, nums[i]);
            }
        }
        return len;
    }

    static void BS(int[]arr, int i , int j , int num){
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid] < num){
                i = mid+1;
            }else{
                j = mid;
            }
        }
        arr[i] = num;
    }
}
