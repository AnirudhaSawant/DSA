package Two Pointers.Medium;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int left = 0, right = 0;
        int ans = 0;

        while(right < fruits.length) {
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0) + 1);
            while(mpp.size() > 2) {
                int freq = mpp.get(fruits[left]);
                if(freq == 1) mpp.remove(fruits[left]);
                else mpp.put(fruits[left],freq - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
