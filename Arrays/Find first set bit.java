class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int count = 1;
        if(n==0)
        return 0;
        while((n&1)==0){
            count++;
            n=n>>1;
        }
        return count;
            
    }
}