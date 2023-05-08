class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int min = 0, max = 0;

        for(int i=1;i<n;i++){
        if(arr[i]-k<0)
        continue;
        max=(int)Math.max(arr[n-1]-k,arr[i-1]+k);
        min=(int)Math.min(arr[0]+k,arr[i]-k);
        diff =(int) Math.min(diff,(max-min));
        }
       
        return diff;
    }
}