class Solution{
    String rremove(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        int n=s.length();
        for(int i=0; i<n; i++){
            boolean flag=false;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                flag=true;
                i++;
            }
            if(flag==false)sb.append(s.charAt(i));
        }
        
        
        
        if(s.length()!=sb.length())return rremove(sb.toString());
        return sb.toString();
    }
}