class Solution{
    static int minxorpair(int N, int arr[]){
        // code here
        Arrays.sort(arr);
        int minValue=Integer.MAX_VALUE;
		for(int i=0;i<N-1;i++){
			minValue=Math.min(minValue,(arr[i]^arr[i+1]));
		}
		return minValue;
    }
}
