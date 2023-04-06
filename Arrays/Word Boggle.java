public class Trie 
{     
    static final int ALPHABET_SIZE = 256;
    static TrieNode root;
    static List<String> list;
    
    public Trie()
    {
        root = new TrieNode();
        list = new ArrayList<>();
    }
     
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
         
        TrieNode()
        {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
    
    static void insert(String key)
    { 
        TrieNode pCrawl = root;
      
        for(int level = 0; level < key.length(); level++)
        {
            int index = key.charAt(level) - 'A';
            if (pCrawl.children[index] == null) pCrawl.children[index] = new TrieNode();
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    static int[] dx = new int[] { -1, 1, 0, 0, -1, -1, 1, 1 };
    static int[] dy = new int[] { 0, 0, -1, 1, -1, 1, -1, 1 };
    
    static void search(TrieNode pCrawl, char[][] board, boolean[][] vis, int x, int y, StringBuilder sb)
    {
        if(pCrawl.isEndOfWord)
        {
            list.add(sb.toString());
            pCrawl.isEndOfWord = false;
        }

        for(int i=0; i<8; i++)
        {
            int nX = x+dx[i], nY = y+dy[i];
            if(nX<0 || nY<0 || nX>board.length-1 || nY>board[0].length-1 || vis[nX][nY]) continue;

            int index = board[nX][nY]-'A';
            if(pCrawl.children[index] == null) continue;

            vis[nX][nY] = true;
            sb.append(board[nX][nY]);

            search(pCrawl.children[index], board, vis, x+dx[i], y+dy[i], sb);

            vis[nX][nY] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

class Solution
{
    public String[] wordBoggle(char board[][], String[] words)
    {
        Trie t = new Trie();
        for(String s: words) t.insert(s);

        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                int index = board[i][j] - 'A';
                if(t.root.children[index] == null) continue;

                boolean[][] vis = new boolean[board.length][board[0].length];
                StringBuilder sb = new StringBuilder();

                sb.append(board[i][j]);
                vis[i][j] = true;

                t.search(t.root.children[index], board, vis, i, j, sb);
            }
        }
        
        String[] ans = new String[t.list.size()];
        for(int i=0; i<ans.length; i++)
            ans[i] = t.list.get(i);
        
        return ans;
    }
}