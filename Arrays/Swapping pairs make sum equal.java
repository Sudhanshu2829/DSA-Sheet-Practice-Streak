class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        long sum1=0, sum2=0;
        for(int i=0;i<n;i++){
         sum1+=A[i];
        }
        for(int j=0;j<m;j++){
            sum2+=B[j];
            
        }
        if(sum1==sum2){ 
            return 1;
        }
        int i=0,j=0;
        while(i<n && j<m){
            long temp1 = sum1+B[j]-A[i];
            long temp2 = sum2+A[i]-B[j];
            if(temp1==temp2){ 
                return 1;
            }
            if(temp1>temp2){
            i++;
            }
            else{
            j++;
            }
        }
        return -1;
    }

}
