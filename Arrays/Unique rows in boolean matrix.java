class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>>arr = new ArrayList();
        for(int i=0;i<r;i++)
        {
            ArrayList<Integer>temp = new ArrayList();
            for(int j=0;j<c;j++)
            {
                temp.add(a[i][j]);
            }
            if(!arr.contains(temp))
            {
                arr.add(temp);
            }
        }
        return arr;
    }
}