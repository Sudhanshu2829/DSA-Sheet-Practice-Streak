class Solution
{
    String UncommonChars(String A, String B)
    {
        TreeSet<Character>a= new TreeSet<>();
        for(int i=0;i<B.length();i++){
            if(!A.contains(""+B.charAt(i))){
                a.add(B.charAt(i)) ;
            } 
        }
        for(int i=0;i<A.length();i++){
            if(!B.contains(""+A.charAt(i))){
                a.add(A.charAt(i)) ;
             } 
        }
        if(a.size() ==0 ){
            return "-1" ;
        }     
        String a2="" ;
        for(char c:a){
            a2+= c ;
        }
        return a2;
        // code here
    }
}