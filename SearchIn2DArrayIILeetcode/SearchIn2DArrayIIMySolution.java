class SearchIn2DArrayIIMySolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int foundVal=-1;
        for(int i=0;i<rows;i++){
            if(target>=matrix[i][0] && target<=matrix[i][cols-1]){
                foundVal=BS(matrix,target,i);

            }
            if(foundVal!=-1){
                return true;
            }
        }
        return false;
    }
    public static int BS(int[][] matrix,int target,int i){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int s=i*cols;
        int e=s+cols;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(matrix[mid/cols][mid%cols]==target){
                return mid;
            }
            else if(matrix[mid/cols][mid%cols]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;


    }
}