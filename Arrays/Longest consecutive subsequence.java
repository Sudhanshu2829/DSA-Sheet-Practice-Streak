

//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
Arrays.sort(arr);
       int max=1;
       int count=1;
       for(int i=1;i<N;i++){
           if(arr[i]-arr[i-1]==1){
               count++;
           }
           else if(arr[i]-arr[i-1]==0){
               continue;
           }
           else{
               count=1;
           }
           max=Math.max(max,count);
       }
       return max;

	}
}