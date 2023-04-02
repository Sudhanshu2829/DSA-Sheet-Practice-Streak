
class Solution 
{ 
    String printSequence(String S) 
    { 
             String s="2",p="2";
        
        int n=3;
        int count=1;
        HashMap<Character,String> map=new HashMap<>();
        for(char x='A';x<='Z';x++)
        {
            if(x=='S')count--;
           if(count>3)
           {
               count=1;
               s=Integer.toString(n);
               p=Integer.toString(n);
               n++;
           }
        //     s=s+p;
        //   System.out.println(s);
            map.put(x,s);
            s=s+p;
            count++;
            
        }
        map.put('Z',"9999");
        map.put(' ',"0");
      // System.out.println(map);
        
        String ans="";
        for(int i=0;i<S.length();i++)
        {
            ans=ans+map.get(S.charAt(i));
        }
        
        return ans;

    }
}