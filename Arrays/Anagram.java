

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
         if(a.length() != b.length()){
            return false;
        }
        int m[] = new int[26];
        // unordered_map<char,int> m;
        for(int i = 0;i<a.length();i++){
            m[a.charAt(i)-'a']++;
                }
         for(int i = 0;i<b.length();i++){
            m[b.charAt(i)-'a']--;
            }
           for(int i = 0;i<26;i++){
               if(m[i]!=0){
                   return false;
               }
           }
            return true;
        
    }
}