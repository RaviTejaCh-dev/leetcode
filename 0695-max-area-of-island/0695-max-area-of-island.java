class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfsSol(grid,i,j,n,m));
                }
            }
        }
        return maxArea;
    }
    public int dfsSol(int[][] grid, int r, int c, int n, int m){
        if(r<0 || r>=n || c<0 || c>=m || grid[r][c] !=1) 
            return 0;
        grid[r][c] = 2;
        int area = 1;
        area += dfsSol(grid,r-1,c,n,m);
        area += dfsSol(grid,r+1,c,n,m);
        area += dfsSol(grid,r,c-1,n,m);
        area += dfsSol(grid,r,c+1,n,m);
        return area;
    }
}