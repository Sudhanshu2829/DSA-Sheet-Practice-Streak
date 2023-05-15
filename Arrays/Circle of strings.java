class Solution
{
    static void dfs(ArrayList<ArrayList<Integer>> adj , int ind , boolean[] visited){
        visited[ind] = true; 
        for(int i : adj.get(ind)){
            if(visited[i] == false) dfs(adj, i , visited);
        }
    }
       // Define a static function called isCircle that takes an integer n and an array of strings arr as input
    static int isCircle(int n, String arr[]) {
        
        // Create an adjacency list using an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>> ();
        
        // Add 26 empty ArrayLists to the adjacency list
        for(int i= 0 ; i< 26; i++){
            adj.add(new ArrayList<>());
        }
        
        // Define two arrays to keep track of in-degree and out-degree for each letter
        
        int in[] = new int[26];
        int out[] = new int[26];
        
        // Iterate through the array of strings
        for(int i=0 ;i< n;i++){
            String temp = arr[i] ;
            
            // Add an edge from the first letter to the last letter of the current string
            adj.get(temp.charAt(0)- 'a').add(temp.charAt(temp.length() -1) - 'a');
            
            // Increment the out-degree of the first letter and the in-degree of the last letter
            out[temp.charAt(0) - 'a']++;
            in[temp.charAt(temp.length() -1) - 'a']++;
        }
        
        // Check if each letter has the same in-degree and out-degree
        for(int i=0 ;i< 26 ;i ++){
            if(in[i] != out[i] )return 0 ;
        }
        
        // Perform a depth-first search on the adjacency list to check if all nodes are connected
        boolean [] visited =  new boolean[26];
        dfs(adj, arr[0].charAt(0) -'a' , visited);
        
        // Check if any unvisited nodes have non-zero in-degree or out-degree
        for(int i = 0;i < 26; i++){
            if(visited[i] == false && (in[i] != 0 || out[i] != 0))return 0 ;
        }
        
        // If all checks pass, return 1 to indicate that the input array of strings forms a circle of words
        return 1;
    }
}