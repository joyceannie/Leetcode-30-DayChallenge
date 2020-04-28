class MinimalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix==null || matrix.length==0) {
            return 0;
        }
        int size = 0;
        int [][] dp = new int[matrix.length+1][matrix[0].length+1];
        for (int i=1; i<=matrix.length; i++) {
            for (int j=1; j<=matrix[0].length; j++) {
                if (matrix[i-1][j-1]=='1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1]) +1;
                    size = Math.max(size, dp[i][j]);
                }
            }
        }
        return size * size;
    }
}
