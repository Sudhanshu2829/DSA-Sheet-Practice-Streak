

class Node{
    int row;
    int col;
    int dist;
    Node(int r, int c, int d){
        row = r;
        col = c;
        dist = d;
    }
}


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    
    private static void computeDistance(int[][] grid, int[][] d, boolean[][] v, Queue<Node> q){
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()){
            int i = q.peek().row;
            int j = q.peek().col;
            int dist = q.peek().dist;
            d[i][j] = dist;
            q.poll();
            int[] a = {-1, 0, 1, 0};
            int[] b = {0, -1, 0, 1};
            for(int k = 0; k < 4; k++){
                int row = i + a[k];
                int col = j + b[k];
                if(row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == 1 && v[row][col] == false){
                    q.add(new Node(row, col, dist + 1));
                    v[row][col] = true;
                }
            }
    }
        
    }
    
    public int orangesRotting(int[][] grid)
    {
         // Code here
        int n = grid.length;
        int m = grid[0].length;
        int[][] d = new int[n][m];
        boolean[][] v = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new Node(i, j, 0));
                    d[i][j] = 0;
                    v[i][j] = true;
                } else {
                    v[i][j] = false;
                }
            }
        }
        computeDistance(grid, d, v, q);
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(v[i][j] == false && grid[i][j] == 1){
                    return -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maxi = Math.max(maxi, d[i][j]);
            }
        }
        return maxi;
    }
}