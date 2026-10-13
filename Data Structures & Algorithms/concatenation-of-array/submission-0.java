class Solution {
    public int[] getConcatenation(int[] nums) {
        int ansSize = nums.length * 2;
        int[] ans = new int[ansSize];
        int i = 0;
        while(i < nums.length) {
            ans[i] = nums[i++];
        }
        int j = 0;
        while(j < nums.length) {
            ans[i++] = nums[j++];
        }
        return ans;
    }
}