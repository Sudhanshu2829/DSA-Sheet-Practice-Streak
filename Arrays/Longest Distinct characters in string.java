class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashSet<Character>set=new HashSet<>();
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++){
            
            if(set.contains(S.charAt(i))){
                while(set.contains(S.charAt(i))){
                    set.remove(S.charAt(start));
                    start++;
                }
            }
            max=Math.max(max,i-start+1);
            set.add(S.charAt(i));
        }
        return max;
    }
}