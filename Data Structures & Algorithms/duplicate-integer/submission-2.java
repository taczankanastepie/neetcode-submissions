class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> visitedItems = new HashMap<>();
        int current;
        boolean isUnique = false;
        for(int i = 0; i < nums.length; i++) {
            current = nums[i];
            if(visitedItems.get(current) != null) {
                isUnique = true;
                break;
            } else {
                visitedItems.put(current, 1);
            }
        }
        
        return isUnique;
    }
}