class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == '1'){
                    dfsSol(grid,i,j,n,m);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfsSol(char[][] grid, int r, int c, int n, int m){
        if(r < 0 || r>=n || c < 0 || c>=m || grid[r][c] != '1'){
            return;
        }
        grid[r][c] = '2';
        dfsSol(grid,r-1,c,n,m);
        dfsSol(grid,r+1,c,n,m);
        dfsSol(grid,r,c-1,n,m);
        dfsSol(grid,r,c+1,n,m);
    }
}