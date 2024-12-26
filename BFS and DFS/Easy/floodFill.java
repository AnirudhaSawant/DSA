package BFS and DFS.Easy;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, int curr) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;

        if(curr != image[sr][sc]) return;

        image[sr][sc] = color;

        helper(image,sr - 1, sc, color, curr);
        helper(image,sr + 1, sc, color, curr);
        helper(image,sr, sc - 1, color, curr);
        helper(image,sr, sc + 1, color, curr);
    }
}
