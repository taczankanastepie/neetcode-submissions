class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> histogramS = new HashMap<>();
        Map<Character, Integer> histogramT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            histogramS.computeIfPresent(s.charAt(i), (ch, c) -> c + 1);
            histogramS.computeIfAbsent(s.charAt(i), ch -> 1);

            histogramT.computeIfPresent(t.charAt(i), (ch, c) -> c + 1);
            histogramT.computeIfAbsent(t.charAt(i), ch -> 1);
        }

        for(Character ch : histogramS.keySet()) {
            if(!histogramS.get(ch).equals(histogramT.get(ch))) {
                return false;
            }
        }

        return true;
    }
}