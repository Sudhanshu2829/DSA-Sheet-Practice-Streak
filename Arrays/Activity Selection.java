class Solution
{
    public static int activitySelection(int start[], int end[], int n)
    {
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr,(a,b)->{
            return a[1]-b[1];
        });
        int pe=-1;
        int ans=0;
        for(int[]b:arr)
        {
            if(pe<b[0])
            {
                ans++;
                pe=b[1];
            }
        }
        return ans;
    }
}