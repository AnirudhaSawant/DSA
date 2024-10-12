package Binary Search.Easy;

class Solution {
    public int arrangeCoins(int n) {
        long st = 1;
        long end = n;

        while(st <= end) {
            long mid = st + (end - st) / 2;
            if(mid * (mid + 1) / 2 == n) {
                return (int)mid;
            }
            else if(mid * (mid + 1) / 2 < n) {
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)end;
    }
}
