class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n = word1.length();
        int m = word2.length();
        int i = 0, j = 0;
        while(i < n && j < m) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));

        return sb.toString();
    }
}