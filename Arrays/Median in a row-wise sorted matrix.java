
class Solution {
    int countLessThanMid(int ar[],int x){
        int start=0,end=ar.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]<=x) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    int median(int matrix[][], int R, int C) {
        // code here    
        int start=1;
        int end=2000;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0;i<R;i++){
                count+=countLessThanMid(matrix[i],mid);
            }
            if(count<=((R*C)/2)) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
}