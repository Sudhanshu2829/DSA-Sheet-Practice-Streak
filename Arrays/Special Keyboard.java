

// User function Template for Java

class Solution{
    static int optimalKeys(int N){
        if (N <= 6)
            return N;
        int screen[] = new int[N];

        int b; 

        int n;
        for (n = 1; n <= 6; n++)
            screen[n - 1] = n;

        for (n = 7; n <= N; n++) {
            screen[n - 1] = 0;
            for (b = n - 3; b >= 1; b--) {
                int curr = (n - b - 1) * screen[b - 1];
                if (curr > screen[n - 1])
                    screen[n - 1] = curr;
            }
        }

        return screen[N - 1];
    }
}