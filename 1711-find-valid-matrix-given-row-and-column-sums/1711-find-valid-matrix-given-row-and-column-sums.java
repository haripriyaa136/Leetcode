class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length,m=colSum.length;
        int validMatrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                validMatrix[i][j]=Math.min(rowSum[i],colSum[j]);
                rowSum[i]-=validMatrix[i][j];
                colSum[j]-=validMatrix[i][j];
            }
        }
        return validMatrix;

    }
}