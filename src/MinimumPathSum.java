class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0) {
            return 0;
        } 
        int m = grid.length;
        int n = grid[0].length;
        int[][] distance = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i==0 && j==0) {
                    distance[i][j] = grid[i][j];
                } else {
                    distance[i][j] = grid[i][j] + Math.min(findDistance(i-1, j, distance), findDistance(i, j-1, distance));
                }
            }
        }
        return distance[m-1][n-1];
    }
    public int findDistance(int i, int j, int[][] distance) {
        if (i<0 || j<0) {
           return Integer.MAX_VALUE; 
        }
        return distance[i][j];
        
    }
}
