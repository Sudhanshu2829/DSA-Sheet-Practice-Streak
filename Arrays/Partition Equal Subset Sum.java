class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for (int i = 0; i< arr.length;i++) {
            sum+=arr[i];
        }
        if (sum %2 != 0){
            return 0;
        }
        boolean[] p = new boolean[sum/2 + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = sum/2; j >= arr[i]; j--) {
                if (p[j - arr[i]] == true || j == arr[i])
                    p[j] = true;
            }
        }
        return p[sum/2] == true ? 1 : 0;
    }
}
