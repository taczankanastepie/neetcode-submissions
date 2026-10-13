class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> histogramS = new HashMap<>();
        Map<Character, Integer> histogramT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            histogramS.put(s.charAt(i), histogramS.getOrDefault(s.charAt(i), 0) + 1);
            histogramT.put(t.charAt(i), histogramT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return histogramS.equals(histogramT);
    }
}