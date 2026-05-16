class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;

        while (l < r && l < nums.length) {
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }

            mid = (l + r) / 2;
        }

        if (l == r && nums[l] == target) {
            return l;
        }

        return -1;
    }
}
