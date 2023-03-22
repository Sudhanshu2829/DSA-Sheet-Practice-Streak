import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> hashSet = new HashSet<>();
        int maxLength = 0;

        for (int num : arr) {
            hashSet.add(num);
        }

        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}