class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        long minSum = 0L;
        for(int i=0; i<n; i++) {
            minSum += a[i] * b[(int)n-i-1];
        }
        return minSum;}
}