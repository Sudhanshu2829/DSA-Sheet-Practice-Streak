class Solution {
    static int palindromepair(int N, String arr[]) {
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                String pal=arr[i]+arr[j];
                String pal2=arr[j]+arr[i];
                if(ispalindrome(pal) || ispalindrome(pal2)){
                   return 1;
                }
            }
        }
        return 0;
    }
    static boolean ispalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
