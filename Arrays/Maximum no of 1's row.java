class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int local=0, count1=0,max=Integer.MIN_VALUE;
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Mat[i][j]==1){
                    local=M-j;
                    break;
                }
            }
            if(local>count1){
                count1=local;
                max=i;
            }
        }
        return max;
    }
}