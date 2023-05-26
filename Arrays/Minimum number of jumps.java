class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int ans=1;
        int step=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(i==n-1){
                return ans;
            }
            step--;
            max=Math.max(max,arr[i]+i);
            if(step==0){
                ans++;
                if(max<=i){
                    return -1;
                }
                step=max-i;
            }
        }
        return ans;
    }
}
