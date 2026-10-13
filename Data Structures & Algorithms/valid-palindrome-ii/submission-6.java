class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        boolean limitHit = false;

        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
                // if(limitHit) {
                //     return false;
                // }
                // limitHit = true;
                // if(Character.toLowerCase(s.charAt(l + 1)) == Character.toLowerCase(s.charAt(r)))
                // {
                //     l++;
                //     // continue;
                // } else if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r
                // - 1))) {
                //     r--;
                //     // continue;
                // } else {
                //     return false;
                // }
            }
            l++;
            r--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}