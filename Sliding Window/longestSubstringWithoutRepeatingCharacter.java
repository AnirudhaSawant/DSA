class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int len = 0;

        HashSet<Character> hs = new HashSet<>();

        while(right < s.length()) {
            while(hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            len = Math.max(len,right - left + 1);
            right++;
        }
        return len;
    }
}