class Solution
{
    public static void deleteKey(TrieNode root,char[] key)
    {
        TrieNode curr = root;
        for(int i = 0; i < key.length; i++) {
            char ch = key[i];
            if(curr.subNode(ch) != null)
                curr = curr.subNode(ch);
        }
        if(curr.isEnd)
            curr.isEnd = false;
    }
}