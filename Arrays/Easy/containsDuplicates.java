class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(mpp.containsKey(nums[i]) && mpp.get(nums[i]) >= 1) {
                return true;
            }
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0) + 1);
        }
        return false;
    }
}