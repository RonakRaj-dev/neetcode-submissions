class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();

        // Build frequency map for s
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Decrement for t; early exit if count goes negative
        for (char ch : t.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) - 1);
            if (freq.get(ch) < 0) return false;
        }

        return true;
    }
}
