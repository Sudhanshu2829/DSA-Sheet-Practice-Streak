class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        int j;
        Stack<Integer> stack =new Stack<Integer>();
        ArrayList<Integer> al =new ArrayList<Integer>();
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=stack.peek()){
                stack.push(arr[i]);
            }
        }
        while(!stack.empty()){
            j=stack.pop();
            al.add(j);
        }
        return al;
    }
}
