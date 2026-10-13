class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();
        int dif = target - nums[0];
        diffs.put(dif, 0);

        for(int i = 1; i < nums.length; i++) {
            if(diffs.containsKey(nums[i])) {
                return new int [] {diffs.get(nums[i]), i};
            }
            
            dif = target - nums[i];
            diffs.put(dif, i);
        }
        return null;
    }
}
