class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        
        int[] dirX = {-1,0,1,0};
        int[] dirY = {0,1,0,-1};
        // code here
        
        if(A[0][0]==0)
        return -1;
        Pair p = new Pair(0,0);
        Queue<Pair> q = new LinkedList<>();
        q.add(p);
        int count=0;
        boolean [][]visited = new boolean[N][M];
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                Pair p1 = q.poll();
                int m = p1.x;
                int n = p1.y;
                
                if(m==X && n==Y){
                    return count;
                }
                
                for(int i=0;i<4;i++){
                    int newX = m + dirX[i];
                    int newY = n + dirY[i];
                    if(newX>=0 && newX <N && newY>=0 && newY <M && !visited[newX][newY]&&
                    A[newX][newY]==1){
                        q.add(new Pair(newX,newY));
                        visited[newX][newY]=true;
                    }
                }
                
            }
            count++;
        }
        
        return -1;
        
    }
};