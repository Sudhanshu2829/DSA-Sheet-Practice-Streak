
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            ans = Math.max(ans,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        if(ans==Integer.MIN_VALUE)
        {
            return -1;
        }
        return (long)ans;
    }
    
}