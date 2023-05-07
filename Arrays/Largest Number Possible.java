class Solution{
    static String findLargest(int n, int s){
        // code here
        if(n==1&&s==0)
        return "0";
        if(s==0)
        return "-1";
        int i=9;

        StringBuilder str = new StringBuilder();
        while(s>0 && i>0){
            if(s-i>=0){
                int j = s/i;
                int x = j;
                while(j>0){
                str.append((char)(i+'0'));
                    j--;
                }
                s-=x*i;
            }
            else{
                i--;
            }
        }
        if(str.length()>n)
        return "-1";
        i = str.length();
        while(i<n){
            str.append('0');i++;
        }
        return str.toString();
    }
}