class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> visitedItems = new HashMap<>();
        int current;
        for(int i = 0; i < nums.length; i++) {
            current = nums[i];
            if(visitedItems.get(current) != null) {
                return true;
            } else {
                visitedItems.put(current, true);
            }
        }

        return false;
    }
}