class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j) {
            int width = j - i;
            int hght = Math.min(height[i],height[j]);

            if(width * hght > water) {
                water = width * hght;
            }
            if(height[i] < height[j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}