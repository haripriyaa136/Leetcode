class Solution {
    public int[][] sortTheStudents(int[][] grid, int k) {
         for(int i=0;i<grid.length;i++){
            for(int j=i+1;j<grid.length;j++){
                if(grid[i][k]<grid[j][k]){

                    int[] temp=grid[i];
                    grid[i]=grid[j];
                    grid[j]=temp;
                }
            }
        }
         return grid;
    }
}