class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int j=0;j<n;j++) {
            sum+=arr[j];
            if (sum==0) {
                maxLen = j+1;
            }
            else if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, j-map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        return maxLen;
        // Your code here
    }
}