class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] matrix = new int[l1+1][l2+1];
        for (int i=0; i<=l1; i++) {
            for (int j=0; j<=l2; j++) {
                if (i==0 || j==0) {
                    matrix[i][j] = 0;
                } else if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[l1][l2];
    }
}
