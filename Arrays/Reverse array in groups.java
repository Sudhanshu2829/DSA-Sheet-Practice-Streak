class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i+=k){
            int left=i,temp=0;
            int right=Math.min(i+k-1,n-1);
            while(left<right){
                temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                right--;
                left++;
            }
        }
        
    }
}
