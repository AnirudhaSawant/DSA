package Binary Search.Easy;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();

        for(int ele : nums1) {
            s1.add(ele);
        }

        HashSet<Integer> s2 = new HashSet<>();
        
        for(int ele : nums2) {
            if(s1.contains(ele)) {
                s2.add(ele);
            }
        }

        int[] ans = new int[s2.size()];
        int ind = 0;
        for(int ele : s2) {
            ans[ind++] = ele;
        }

        return ans;
    }
}
