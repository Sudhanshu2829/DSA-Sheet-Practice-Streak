static void insert(TrieNode root, String key) 
{
    TrieNode curr = root;
    
    for(int i = 0;i<key.length();i++)
    {
        int idx = key.charAt(i) - 'a';

        if(curr.children[idx]==null)
        {
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx]; 
    }
    
    curr.isEndOfWord = true;
}

static boolean search(TrieNode root, String key)
{
    TrieNode curr = root;
    
    for(int i = 0;i<key.length();i++){
        int idx = key.charAt(i) - 'a';
        
        if(curr.children[idx]!=null)
        {
            curr = curr.children[idx];
        }
        else{
            return false;
        }
    }
    
    return curr.isEndOfWord == true;
}