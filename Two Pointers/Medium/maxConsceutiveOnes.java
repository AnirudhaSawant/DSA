package Two Pointers.Medium;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int left = 0, zero = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zero++;
                while(zero > k) {
                    int val = nums[left++];
                    if(val == 0) zero--;
                }
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
