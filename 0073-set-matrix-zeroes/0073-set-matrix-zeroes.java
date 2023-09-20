class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> li = new HashSet<Integer>();
        HashSet<Integer> lj = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    li.add(i);
                    lj.add(j);
                }            
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(li.contains(i) || lj.contains(j)){
                    matrix[i][j]=0;                }
            }
        }

    }
}