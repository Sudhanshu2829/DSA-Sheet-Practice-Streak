class Solution
{ 
    static int i;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int[] ans = new int [nums.length];
        i=0;
        int mid  = (nums.length-1)/2;
        ans[i] = nums[mid];
        i++;
        fun(nums,0,mid-1,ans);
        fun(nums,mid+1,nums.length-1,ans);
        return ans;
        
    }
    
    public static void fun(int[] nums, int l, int r, int[]ans){
        if(l<=r){
            int mid = (l + r)/2;
            ans[i] = nums[mid];
            i++;
            fun(nums,l, mid-1, ans);
            fun(nums,mid+1,r,ans);
        }
    }
    
}