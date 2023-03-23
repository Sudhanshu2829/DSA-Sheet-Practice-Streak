
class Solution
{
    int search(int A[], int l, int h, int key)
    {
        while (l <= h) { 
            int mid = (l+ h)/2; 
            if (A[mid] == key)
                return mid;

            if (A[l] <= A[mid]) { 
                if (A[l] <= key && A[mid] >= key)
                    h = mid - 1; 
                else
                    l= mid + 1;
            } else { 
                if (A[mid] <= key && key <= A[h])
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return -1;
    }
}