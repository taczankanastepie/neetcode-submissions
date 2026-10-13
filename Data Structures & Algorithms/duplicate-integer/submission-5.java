class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> visitedItems = new HashSet<>();
        int current;
        for(int i = 0; i < nums.length; i++) {
            current = nums[i];
            if(visitedItems.contains(current)) {
                return true;
            } else {
                visitedItems.add(current);
            }
        }

        return false;
    }
}