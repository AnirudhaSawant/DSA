class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int ele : arr) {
            mpp.put(ele,mpp.getOrDefault(ele,0) + 1);
        }

        int[] freq = new int[mpp.values().size()];
        int ind = 0;
        for(int fq : mpp.values()) {
            freq[ind++] = fq;
        }

        Arrays.sort(freq);

        int ans = 0, removed = 0, half = arr.length / 2;
        ind = freq.length - 1;

        while(removed < half) {
            ans += 1;
            removed += freq[ind--];
        }
        return ans;
    }
}