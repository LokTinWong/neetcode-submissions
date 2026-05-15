class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int newCount = sMap.get(s.charAt(i)) + 1;
                sMap.put(s.charAt(i), newCount);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                int newCount = tMap.get(t.charAt(i)) + 1;
                tMap.put(t.charAt(i), newCount);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }

        return sMap.entrySet().equals(tMap.entrySet());
    }
}
