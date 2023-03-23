class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(M> N){
            return -1;
        }
        int sum = 0;
        int max = 0;
        for(int val: A){
            sum += val;
            max = Math.max(max,val);
        }
        
        int lo = max;
        int hi = sum;
        int ans = 0;
        
        while(lo<= hi){
            int mid = lo + (hi-lo)/2;
            
            if(isPossible(A,mid,M) == true){
                ans = mid;
                hi = mid - 1;
            }else{
                
                lo = mid + 1;
            }
        }
        return ans;
    }
    
    public static boolean isPossible(int[] A,int mid, int M){
        int st = 1;
        int sum = 0;
        
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            
            if(sum > mid){
                st++;
                sum = A[i];
            }
        }
        
        return st <= M;
    }
};