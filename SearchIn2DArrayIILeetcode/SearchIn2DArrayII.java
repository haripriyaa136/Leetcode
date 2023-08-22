public class SearchIn2DArrayII {
    //Optimized approach:

    public static void main(String args[]){
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=900;
        System.out.println(findTarget(matrix,target));
    }
    public static Boolean findTarget(int[][] matrix,int target){
        int row=0;
        int cols=matrix[0].length-1;
        while(row<=matrix.length-1 && cols>=0){
            //We are going to start checking with the top right element.If that element is smaller than the target then target will not be present in the entire row
            //Because the row is sorted ascending, so we will move to the next row. If the element is greater than the target, then target will not be in entire column so we do col--;

            int val=matrix[row][cols];
            if(val<target){
                row++;
            }
            else if(val>target){
                cols--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
