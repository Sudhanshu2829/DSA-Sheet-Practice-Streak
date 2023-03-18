class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0,temp=0,mid=0,high=n-1;
        while(mid<=high){
            switch(a[mid]){
                case 0:{
                    temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}