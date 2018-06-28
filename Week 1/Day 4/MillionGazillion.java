public class MillionGazillion {
    class Trie
    {
        final int ALPHABET_SIZE=26;
        TrieNode root=new TrieNode();
        class TrieNode
        {
            TrieNode[] children=new TrieNode[ALPHABET_SIZE];
            boolean isEndOfWord;
            TrieNode()
            {
                isEndOfWord=false;
                for(int i=0;i<ALPHABET_SIZE;i++)
                {
                    children[i]=null;
                }
            }

        }
        public boolean addWord(String key)
        {
            int level;
            int length=key.length();
            int index;
            TrieNode node=root;
            for(level=0;level<length;level++)
            {
                index=key.charAt(level)-'a';
                if(node.children[index]==null)
                    node.children[index]=new TrieNode();

                node=node.children[index];
            }
            if(node.isEndOfWord)
            {
                return false;
            }
            else
            {
                node.isEndOfWord = true;
                return true;
            }
        }
    }
}