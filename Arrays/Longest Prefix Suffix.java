
class Solution {
    int lps(String s) {
        // code here
        int lps[] = new int[s.length()];
        lps[0] = 0;
        int i = 0;
        int n = s.length();
        int j = 1;
        while(j < n)
        {
            if(s.charAt(i) == s.charAt(j))
            {
               lps[j] = i+1;
               i++;
               j++;
            }
            else
            {
                if(i == 0)
                {
                    lps[j] = 0;
                    j++;
                }
                else
                {
                    i = lps[i-1];
               }
            }
        }
        return lps[s.length()-1];
    }
}