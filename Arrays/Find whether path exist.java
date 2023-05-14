class Pair{
    int x;
    int y;
    Pair(int x , int y){
        this.x=x;
        this.y=y;
    }
}

class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] A)
    {
        // Code here
         int[] dirX = {-1,0,1,0};
        int[] dirY = {0,1,0,-1};
        
        int N = A.length;
        int M = A[0].length;
        // code here
        int sourceX=-1,sourceY=-1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==1){
                    sourceX=i;
                    sourceY=j;
                    break;
                }
            }
        }
        Pair p = new Pair(sourceX,sourceY);
        Queue<Pair> q = new LinkedList<>();
        q.add(p);
        boolean [][]visited = new boolean[N][M];
        visited[sourceX][sourceY]=true;
        while(!q.isEmpty()){
           
            
                Pair p1 = q.poll();
                int m = p1.x;
                int n = p1.y;
                
                if(A[m][n]==2){
                    return true;
                }
                
                for(int i=0;i<4;i++){
                    int newX = m + dirX[i];
                    int newY = n + dirY[i];
                    if(newX>=0 && newX <N && newY>=0 && newY <M && !visited[newX][newY]&&
                    (A[newX][newY]==3 || A[newX][newY]==2)){
                        q.add(new Pair(newX,newY));
                        visited[newX][newY]=true;
                    }
                }
                
           
        }
        
        return false;
    }
}