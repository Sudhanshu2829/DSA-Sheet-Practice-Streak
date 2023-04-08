//User function Template for Java

class Solution {
    static int toggleBits(int N, int L, int R) {
        int mask = (1 << (R - L + 1)) - 1; // Create a mask with R-L+1 bits set to 1
        mask = mask << (L - 1); // Shift the mask to the left by L-1 positions
        return N ^ mask; // XOR the mask with N to toggle the bits
    }
}