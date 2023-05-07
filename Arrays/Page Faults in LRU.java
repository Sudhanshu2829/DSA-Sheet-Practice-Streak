class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        Queue<Integer> q = new LinkedList<>();
        int pageFault = 0;

        for (int i = 0; i < N; i++) {
            int page = pages[i];
             if (q.contains(page)) {
                 q.remove(page);
                 q.add(page);
             } else if (!q.contains(page) && q.size() < C) {
                 q.add(page);
                 pageFault++;
             } else {
                 q.poll();
                 q.add(page);
                 pageFault++;
             }
        }
        
        return pageFault;
    }
}