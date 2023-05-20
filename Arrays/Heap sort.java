class Solution
{
    void buildHeap(int arr[], int n)
    {
        for(int i = (n-2)/2;i>=0;i--){
            heapify(arr,n,i);
        }
    }
 
    void heapify(int arr[], int n, int i)
    {
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;
        if(left<n&&arr[largest]<arr[left]){
            largest = left;
        }
        if(right<n&&arr[largest]<arr[right]){
            largest = right;
        }
        if(largest!=i){
             int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }

    public void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
        for(int i = n-1;i>0;i--){
            int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
            heapify(arr,i,0);
        }
    }
 }
