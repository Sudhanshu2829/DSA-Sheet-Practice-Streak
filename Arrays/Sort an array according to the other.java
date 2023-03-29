class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A1[i])){
                int count=map.get(A1[i]);
                map.put(A1[i],count+1);
            }
            else{
                map.put(A1[i],1);
            }
        }
        int ans[]=new int[N];
        int x=-1;
        int count=0;
        for(int i=0;i<M;i++){
            if(map.containsKey(A2[i])){
            // count=map.get(A2[i]);
               while(map.get(A2[i])>0){
                   x++;
                ans[x]=A2[i];
                count=map.get(A2[i]);
                map.put(A2[i],count-1);
               }
            }
             
        }
         ArrayList<Integer> list=new ArrayList<>();
         HashMap<Integer,Integer> temp=new HashMap<>();
         for(int i=0;i<M;i++){
            temp.put(A2[i],1);
         }
        for(int i=0;i<N;i++){
            if(!temp.containsKey(A1[i])){
                list.add(A1[i]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            x++;
            ans[x]=list.get(i);
        }
        
        return ans;
    }
}