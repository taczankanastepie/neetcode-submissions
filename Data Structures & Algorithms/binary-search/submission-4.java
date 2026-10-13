class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int middle = nums.length / 2;

        while(l <= r) {
            if(nums[middle] > target) {
                r = middle - 1;
            } else if(nums[middle] < target) {
                l = middle + 1;
            } else {
                return middle;
            }
            middle = l + (r - l) / 2;
        }

        return -1;
    }
}
