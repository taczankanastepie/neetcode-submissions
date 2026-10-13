
class Solution {
    public int majorityElement(int[] nums) {
        
        var numsToApperance = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(numsToApperance.get(nums[i]) == null) {
                numsToApperance.put(nums[i], 1);
            } else {
                var occurrence = numsToApperance.get(nums[i]);
                numsToApperance.replace(nums[i], occurrence + 1);
            }
        }

        var entries = numsToApperance.entrySet();
        Map.Entry<Integer, Integer> max = null;
        boolean firstIter = true;

        for (Map.Entry<Integer, Integer> entry: entries) {
            if(firstIter) {
              max = entry;
              firstIter = false;
              continue;
            }

            if(entry.getValue() > max.getValue()) {
                max = entry;
            }
        }

        return max.getKey();
    }
}