class Solution
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int M, int N)
    {
        // your code here
        Arrays.sort(y);
        // array to store no of 0s to 4s
        int[] no = new int[5];
        for(int i=0; i< N; i++){
            if(y[i] < 5){
                no[y[i]]++;
            }
        }
        long res = 0;
        for(int i=0; i<M; i++){
            res += count(x[i], y, N, no);
        }
        
        return res;
    }
    
    static long count(int x, int y[], int n, int[] no){
        // if x is 0, there are no possible pairs
        if(x==0){
            return 0;
        }
        
        if(x==1){
            return no[0];
        }
        int ans = 0;
        int index = Arrays.binarySearch(y,x);
        if(index < 0){
            index = -1 - index;
        }else{
            while(index < n && y[index] == x){
                index++;
            }
        }
        ans += n - index;
        ans += no[0]+no[1];
        
        if(x ==2){
            ans -= no[3] + no[4];
        }
        
        if(x==3){
            ans += no[2];
        }
        
        return ans;
    }
}