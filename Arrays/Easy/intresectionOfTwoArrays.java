class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int num : nums1) {
            mpp.put(num, mpp.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
            if(mpp.containsKey(num) && mpp.get(num) > 0) {
                list.add(num);
                mpp.put(num,mpp.get(num) - 1);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}