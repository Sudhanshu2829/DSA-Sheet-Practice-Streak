class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        LinkedList<Integer> ll = new LinkedList<>();
        
        int coin[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2,1};
        int l = coin.length;
        
        for(int i=0; i<l; i++){
            if(coin[i] <= N){
                while(coin[i]<=N){
                    ll.add(coin[i]);
                    N-=coin[i];
                }
            }
        }
        return ll;
    }
}
