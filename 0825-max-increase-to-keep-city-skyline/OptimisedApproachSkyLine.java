import java.util.Arrays;
public class OptimisedApproachSkyLine {
    public static void main(String args[]){
        int grid[][]={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int max_Sum=0;
                int maxRows[]=new int[grid.length];
            int maxCols[]=new int[grid.length];
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid.length;j++){
                        maxRows[i]=Math.max(maxRows[i],grid[i][j]);
                        maxCols[j]=Math.max(maxCols[j],grid[i][j]);
                    }
                }
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid.length;j++){
                        int max=Math.min(maxRows[i],maxCols[j]);
                        if(grid[i][j]<max){
                            max_Sum+=max-grid[i][j];
                        }
                    }
                }
                return max_Sum;
        }
}
