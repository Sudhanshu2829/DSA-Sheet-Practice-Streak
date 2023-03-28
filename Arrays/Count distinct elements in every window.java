
class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
    // code here 
        ArrayList<Integer>  res = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>(); 
        int j = 0;
        for(int i = 0; i < A.length; i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(i >= k-1){
                res.add(map.size());
                int todelete = A[j];
                if(map.get(todelete) == 1) map.remove(todelete);
                else map.put(todelete,map.get(todelete)-1);
                j++;
            }
        }
        return res;
         
    }
}
