

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
         char st1[]=str1.toCharArray();
        char st2[]=str2.toCharArray();
        if(st1.length!=st2.length)
        {
            return false;
        }
        int n=st1.length;
        String ans="";
        for(int i=0;i<st1.length;i++)
        {
            if(st1[(i+2)%n]!=st2[i])
            {
                break;
            }
            if(i==n-1)
            {
                return true;
            }
        }
        for(int i=0;i<st1.length;i++)
         {
            if(st1[i]!=st2[(i+2)%n])
            {
                break;
            }
            if(i==n-1)
            {
                return true;
            }
         } 
        return false;
    }
    
}