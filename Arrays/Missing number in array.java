class Solution {
    int MissingNumber(int array[], int n) {
        int sum=(n)*(n+1)/2;
        for(int i=0;i<n-1;i++){
            sum-=array[i];
        }
        return sum;
    }
}