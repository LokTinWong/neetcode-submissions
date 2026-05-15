class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] out = new int[2];

        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            if (map.containsKey(target - nums[currIndex])) {
                
                if (map.get(target - nums[currIndex]) < currIndex) {
                    out[0] = map.get(target - nums[currIndex]);
                    out[1] = currIndex;
                } else {
                    out[0] = currIndex;
                    out[1] = map.get(target - nums[currIndex]);
                }

                return out;
            } else {
                map.put(nums[currIndex], currIndex);
            }
        }

        return out;
    }
}
