class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        if(arr.length==1){
            return 1;
        }
        else
        {
            int right_sum=0,left_sum=0;
            for (int i=1;i<n;i++){
                right_sum+=arr[i];
            }
            for(int j=0,i=1;i<n;i++,j++){
                right_sum-=arr[i];
                left_sum+=arr[j];
                if(left_sum==right_sum){
                    return i+1;
                }
            }
            return -1;
        }
        // Your code here
    }
}