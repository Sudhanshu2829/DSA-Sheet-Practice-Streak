class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
       int count=0;
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=0; i<(S.length()-pat.length()+1); i++)
       {
          if(pat.charAt(0)==S.charAt(i))
          {
              if(S.substring(i,i+pat.length()).equals(pat))
              {
                  al.add(i+1);
              }
          }
       }
       if(al.size()==0)
       {
           al.add(-1);
       }
       return al;
    }
}