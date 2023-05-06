class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        int count=0;
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<N;i++)
        {
            if(sum+arr[i]<=K)
            {
                
                sum=sum+arr[i];
                count++;
            }
        }
       return count;
    }
}