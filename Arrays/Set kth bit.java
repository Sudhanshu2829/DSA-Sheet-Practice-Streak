//User function Template for Java
class Solution{
    static int setKthBit(int N,int K){
        // code here
        int mask=1<<K;
        return (mask|N);
    }
}