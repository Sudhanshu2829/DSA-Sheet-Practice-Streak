class Solution{
    public void zigZag(int a[], int n){
        int temp=0;
        boolean flag=true;
        for(int i=0;i<=n-2;i++){
            if(flag){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else{
                if(a[i]<a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            flag=!flag;
        }
    }
}
