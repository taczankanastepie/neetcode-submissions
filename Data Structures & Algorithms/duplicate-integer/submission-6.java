class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        int i = 0;
        while(i < nums.length) {
            if(unique.contains(nums[i])) {
                return true;
            } else {
                unique.add(nums[i]);
            }
            i++;
        }
        return false;
    }
}