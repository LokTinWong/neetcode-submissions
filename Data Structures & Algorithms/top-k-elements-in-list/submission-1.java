class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Make an array of size n + 1 because the max frequency is n.
        // We want the indices to rerepresent the frequency.
        // Max index needs to be n because max frequency is n (when nums only has one distinct number).
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            freq[map.get(key)].add(key);
        }

        int count = 0;
        int[] output = new int[k]; // because we want the k most frequent numbers

        for (int i = freq.length - 1; i >= 0 && count < k; i--) {
            for (int n : freq[i]) {
                if (count < k) {
                    output[count] = n;
                    count++;
                }
            }
        }

        return output;
    }
}
