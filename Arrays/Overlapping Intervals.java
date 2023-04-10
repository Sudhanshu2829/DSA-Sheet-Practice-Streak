class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        int n = Intervals.length;
        Arrays.sort(Intervals,(a,b) -> a[0]- b[0]);
        List<int[]> ans = new ArrayList<>();
        for(int [] arr : Intervals){
            if(ans.isEmpty() || ans.get(ans.size() - 1)[1] < arr[0])
                ans.add(arr);
            else
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size()-1)[1], arr[1]);
                
        }
        return ans.toArray(new int[0][]);
    }
}