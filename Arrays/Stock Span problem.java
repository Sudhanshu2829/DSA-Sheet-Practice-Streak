
class Pair
{
    int val;
    int ind;
    Pair(int v,int i)
    {
        this.val=v;
        this.ind=i;
    }
}

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    
    public static int[] calculateSpan(int price[], int n)
    {
         Stack<Pair> stack =new Stack<> ();
         int arr[] =new int[n];
         
         for(int i=0;i<n;i++)
         {
             if(stack.isEmpty())
             {
                 arr[i]=1;
                 stack.push(new Pair(price[i],i));
             }
             else
             {
                 if(stack.peek().val > price[i])
                 {
                     arr[i]=i-stack.peek().ind;
                     stack.push(new Pair(price[i],i));
                 }
                 else
                 {
                     while((!stack.isEmpty()) && stack.peek().val <= price[i])
                     {
                         stack.pop();
                     }
                     if(!stack.isEmpty()) 
                     {
                         arr[i]=i-stack.peek().ind;
                         stack.push(new Pair(price[i],i));
                     }
                     else
                     {
                          arr[i]=i+1;
                          stack.push(new Pair(price[i],i));
                     }
                 }
             }
         }
        return arr; 
    }
    
}