class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int currentPlatformsNeeded = 0;
        int maxPlatformsNeeded = 1;
        int i=0;
        int j=0;
        while(i<n){
            if(arr[i] <= dep[j]){
                currentPlatformsNeeded++;
                maxPlatformsNeeded = Math.max(maxPlatformsNeeded, currentPlatformsNeeded);
                i++;
            } else{
                currentPlatformsNeeded--;
                j++;
            }
        }
        
        return maxPlatformsNeeded;
    }
    
}
