class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0, j = 0; i < 2 * nums.length; i++) {
            if (j >= nums.length) {
                j = 0;
            }
            ans[i] = nums[j++];
        }
        return ans;
    }
}