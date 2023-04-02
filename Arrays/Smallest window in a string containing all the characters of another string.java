class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
        // Your code here
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        int index=-1;

        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        for(int k=0;k<t.length();k++)
        {
            hash.put(t.charAt(k),hash.getOrDefault(t.charAt(k),0)+1);
        }

        int count=hash.size();
        while(j<s.length())
        {
            char c=s.charAt(j);
            if(hash.containsKey(c))
            {
                hash.put(c,hash.get(c)-1);
                if(hash.get(c)==0) count--;
            }

            while(count==0)
            {
                if(ans>j-i+1)
                {
                    ans=j-i+1;
                    index=i;
                }

                char ch=s.charAt(i);
                if(hash.containsKey(ch))
                {
                    hash.put(ch,hash.get(ch)+1);
                    if(hash.get(ch)>0) count++;
                }
                i++;
            }
            j++;
        }
        return (index==-1)? "-1" : s.substring(index,index+ans);
    }
}