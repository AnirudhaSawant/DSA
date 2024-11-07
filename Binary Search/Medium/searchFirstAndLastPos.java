class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = searchFirst(nums,target);
        ans[1] = searchLast(nums,target);
        return ans;
    }

    public int searchFirst(int[] nums, int tar) {
        int st = 0, end = nums.length - 1;
        int ans = -1;

        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(nums[mid] == tar) {
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] < tar) {
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

     public int searchLast(int[] nums, int tar) {
        int st = 0, end = nums.length - 1;
        int ans = -1;

        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(nums[mid] == tar) {
                ans = mid;
                st = mid + 1;
            }
            else if(nums[mid] < tar) {
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}