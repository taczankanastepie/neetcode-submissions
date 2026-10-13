class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        int i = 0;
        boolean notExceedsShortestStrLength = true;
        for(i = 0; i < strs[0].length() && notExceedsShortestStrLength; i++) {
            Character ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != ch) {
                    i--;
                    notExceedsShortestStrLength = false;
                    break;
                }
            }
        }
        return strs[0].substring(0, i);
    }
}