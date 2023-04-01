class Solution {
    static String removeDups(String S) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder uniqueStr = new StringBuilder();

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(!hashSet.contains(ch)){
                hashSet.add(ch);
                uniqueStr.append(ch);
            }
        }
        return uniqueStr.toString();
    }
}