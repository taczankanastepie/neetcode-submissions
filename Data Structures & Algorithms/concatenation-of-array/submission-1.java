class Solution {
    public int[] getConcatenation(int[] nums) {
        int offset = nums.length;
        int[] ans = new int[offset * 2];
        for(int i = 0; i < offset; i++) {
            ans[i] = ans[i + offset] = nums[i];
        }

        return ans;
    }
}