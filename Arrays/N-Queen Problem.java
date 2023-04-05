
// User function Template for Java
class Solution{
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
       return solveNQueens(n);
    }
    private static int len, hori[],upper[],down[];
    private static char mat[][];
    public static  ArrayList<ArrayList<Integer>>  solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        mat = new char[n][n];
        for(int i=0;i<n;i++)Arrays.fill(mat[i],'.');
        len=n;
        hori=new int[n];
        upper=new int[2*n-1];
        down=new int[2*n-1];
        dfs1(0,0,ans);
        return ans;
    }
    private static void dfs1(int col,int row,ArrayList<ArrayList<Integer>> ans){
        if(col==len){
            addAns(mat,ans,len);
            return;
        }
        for(int r=0;r<len;r++){
            int upd=r+col;
            int dd=len-1+col-r;
            if(hori[r]==0 && upper[upd]==0 && down[dd]==0&& mat[r][col]=='.'){
               mat[r][col]='Q';//set the queen
               upper[upd]=1;
               hori[r]=1;
               down[dd]=1;
                dfs1(col+1,row,ans);//next col check
                mat[r][col]='.';//back track
                upper[upd]=0;
               hori[r]=0;
               down[dd]=0;
            }
        }
    }
        static void addAns(char m[][],ArrayList<ArrayList<Integer>> ans,int n){
        ArrayList<Integer> tem =new ArrayList<>();
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(m[i][j]=='Q'){
                    tem.add(i+1);
                    break;
                }
            }
        }
        ans.add(tem);
    }
}
