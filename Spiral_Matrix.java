class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List l1=new ArrayList();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if(!l1.contains(matrix[top][i])){
                    l1.add(matrix[top][i]);
                }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                if(!l1.contains(matrix[i][right])){

                l1.add(matrix[i][right]);
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                if(!l1.contains(matrix[bottom][i])){

                l1.add(matrix[bottom][i]);
                }
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                if(!l1.contains(matrix[i][left])){
                    l1.add(matrix[i][left]);

                }
            }
            left++;
        }
        return l1;
    }
}