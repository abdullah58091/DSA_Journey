public class Suffix_Longest_common {
     class TrieNode {
        TrieNode[] child = new TrieNode[26];

        int index = -1;   
        int len = Integer.MAX_VALUE; 
    }

    TrieNode root = new TrieNode();
     public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
    
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

   
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    void insert(String word, int idx) {

        TrieNode node = root;

    
        update(node, word.length(), idx);

        
        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                node.child[c] = new TrieNode();
            }

            node = node.child[c];

            update(node, word.length(), idx);
        }
    }

    int search(String word) {

        TrieNode node = root;

      
        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                break;
            }

            node = node.child[c];
        }

        return node.index;
    }

    void update(TrieNode node, int len, int idx) {

        if (len < node.len) {
            node.len = len;
            node.index = idx;
        }
    }
        
    public static void main(String[] args) {
        Suffix_Longest_common solution = new Suffix_Longest_common();

        String[] wordsContainer = {"hello", "world", "leetcode"};
        String[] wordsQuery = {"lo", "or", "code", "abc"};

        int[] result = solution.stringIndices(wordsContainer, wordsQuery);

        for (int index : result) {
            System.out.println(index);
        }
    }
}
