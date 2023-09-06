class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int max=Integer.MIN_VALUE;
        int max_sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                max=Math.min(rowMax(grid,i,j),colMax(grid,i,j));
                if(grid[i][j]<max){
                    max_sum+=Math.abs(max-grid[i][j]);
                }
            }
        }
        return max_sum;
        
    }
    public int rowMax(int[][] grid,int row, int col){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grid[0].length;i++){
            max=Math.max(max,grid[row][i]);
        }
        return max;
    }
    public int colMax(int[][] grid,int row,int col){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            max=Math.max(max,grid[i][col]);
        }
        return max;

    }

}