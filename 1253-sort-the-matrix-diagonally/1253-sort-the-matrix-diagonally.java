class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> hm = new HashMap<Integer,PriorityQueue<Integer>>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                hm.putIfAbsent((i-j),new PriorityQueue<Integer>() );
                hm.get(i-j).add(mat[i][j]);
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=hm.get(i-j).poll();
            }
        }
        return mat;

    }
}