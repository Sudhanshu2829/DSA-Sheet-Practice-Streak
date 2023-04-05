// m is the given matrix and n is the order of matrix
class Solution {
    static void dfs(int i, int j, boolean [][]vis,int[][]maze,String path, int n, ArrayList<String>ans){
        if(i>=n || i<0 || j>=n || j<0 || maze[i][j]==0 || vis[i][j] == true) return;
        if(i==n-1 && j==n-1){
            ans.add(path);
            return ;
        }
        vis[i][j]=true;
        dfs(i+1,j,vis,maze,path +'D',n,ans);
        dfs(i,j+1,vis,maze,path +'R',n,ans);
        dfs(i,j-1,vis,maze,path +'L',n,ans);
        dfs(i-1,j,vis,maze,path +'U',n,ans);
        vis[i][j]=false;
       
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        String path = "";
        boolean vis[][] = new boolean[n][n];
        dfs(0,0,vis,m,path,n,ans);
        return ans;
    }
}