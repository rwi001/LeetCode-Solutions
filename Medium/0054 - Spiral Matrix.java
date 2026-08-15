class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;

            // Top -> Bottom
            for (int j = top; j <= bottom; j++) {
                spiral.add(matrix[j][right]);
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    spiral.add(matrix[bottom][k]);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    spiral.add(matrix[l][left]);
                }
                left++;
            }
        }

        return spiral;
    }
}