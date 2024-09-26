package Easy;
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mpp = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );

        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && mpp.get(s.charAt(i)) < mpp.get(s.charAt(i+1))) {
                ans -= mpp.get(s.charAt(i));
            }
            else{
                ans += mpp.get(s.charAt(i));
            }
        }
        return ans;
    }
}