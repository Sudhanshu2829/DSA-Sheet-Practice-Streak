class Solution{
    String longestCommonPrefix(String a[], int n){
        if(a.length==1){
            return a[0];
        } 
        String min=a[0];
        for(int i=0;i<n;i++){
            while(a[i].indexOf(min)!=0){
                min=min.substring(0,min.length()-1);
            }
            if(min.isEmpty()){
                return "-1";
            }
        }
        return min;
    }
}