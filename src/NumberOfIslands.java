class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j]=='1' && !visited[i][j]) {
                    visit(i, j, m, n, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void visit(int i, int j, int m, int n, char[][] grid, boolean[][] visited) {
        visited[i][j] = true;
        if (isValid(i+1, j, m, n, grid, visited)) {
            visit(i+1, j, m, n, grid, visited);
        }
        if (isValid(i-1, j, m, n, grid, visited)) {
            visit(i-1, j, m, n, grid, visited);
        }
        if (isValid(i, j+1, m, n, grid, visited)) {
            visit(i, j+1, m, n, grid, visited);
        }
        if (isValid(i, j-1, m, n, grid, visited)) {
            visit(i, j-1, m, n, grid, visited);
        }
    }
    
    public boolean isValid(int i, int j, int m, int n, char[][] grid, boolean[][] visited) {
        if (i>=0 && i<m && j>=0 && j<n ) {
            return grid[i][j] =='1' && !visited[i][j];
        }
        return false;
    }
}
