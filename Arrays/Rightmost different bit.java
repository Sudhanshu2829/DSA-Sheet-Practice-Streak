//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here     
        
        int i=0;
        int val = m^n;
        if(m==n){
            return -1;
        }
       return (int)(Math.log(val&-val)/Math.log(2))+1;
    }
}