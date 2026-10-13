class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> visitedItems = new HashMap<>();
        int current;
        for(int i = 0; i < nums.length; i++) {
            current = nums[i];
            if(visitedItems.get(current) != null) {
                return true;
            } else {
                visitedItems.put(current, 1);
            }
        }

        return false;
    }
}