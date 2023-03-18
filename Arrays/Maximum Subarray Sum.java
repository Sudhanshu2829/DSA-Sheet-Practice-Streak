import java.util.* ;
import java.io.*; 

public class Solution {
	//KADANE'S ALGORITHM
	public static long maxSubarraySum(int[] arr, int n) {
		long max = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max=sum;
            }
        }
        return max<0?0:max;
	}

}
