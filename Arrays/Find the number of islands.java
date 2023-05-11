class Solution {
   
   boolean isValid(int a, int b, char[][]grid){
       if(a<0 ||a>=grid.length || b<0 || b>=grid[0].length){
           return false;
       }
       if(grid[a][b]=='0'){return false;}
       return true;
   }
   
   
    public void dfs(int m, int n, char[][]grid, boolean [][]visited){
    
        int[] a={1,-1,1, -1,1, -1,  0,0};
        int []b={0,0,1,-1, -1, 1,1,-1};
        for(int i=0; i<8; i++){
            if(isValid(m+a[i], n+b[i], grid) && visited[m+a[i]][n+b[i]]==false){
                visited[m+a[i]][n+b[i]]=true;
                dfs(m+a[i], n+b[i], grid, visited);
            }
        }
    }   

    public int numIslands(char[][] grid) {
        int count=0;
       boolean [][]visited= new boolean [grid.length][grid[0].length];
       for(int i=0; i<grid.length; i++){
           for(int j=0; j<grid[0].length; j++){
               if(!visited[i][j] && grid[i][j]=='1'){
                   visited[i][j]=true;
                   dfs(i, j, grid, visited);
                   count++;
               }
           }
       }
       return count;
    }
}