class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
       
        
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
                q.remove();
            
            if(q.isEmpty())
                sb.append("#");
            else
                sb.append(q.peek());
        }
        
        return sb.toString();
        
    }
}