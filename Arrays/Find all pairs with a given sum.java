class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<pair> ai=new ArrayList<>();
        HashSet<Long>hs=new HashSet<>();
        for(int i=0;i<N;i++)
        {
            hs.add(A[i]);
        }
        for(int j=0;j<M;j++)
        {
            if(hs.contains(X-B[j]))
            {
                pair p=new pair(X-B[j],B[j]);
            ai.add(p);
            }
        }
        Collections.sort(ai,new Comparator<pair>(){
            public int compare(pair a,pair b)
            {
                return Long.compare(a.first,b.first);
            }
        });
        return ai.toArray(new pair[ai.size()]);
    }
}