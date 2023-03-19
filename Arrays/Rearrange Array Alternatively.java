class Solution{
    public static void rearrange(long arr[], int n){
        int l = 0;
        int r = n-1;
        long max = 1+arr[n-1];
        
        for(int i = 0 ; i < n ; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = arr[i] + (arr[r] % max) * max;
                r--;
            }else
            {
                arr[i] = arr[i] + (arr[l] % max) * max;
                l++;
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = arr[i]/max;
        }
    }
}
