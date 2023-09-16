class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0,tempMax=0;
        for(int i=0;i<accounts.length;i++){
            tempMax=0;
            for(int j=0;j<accounts[0].length;j++){
                tempMax+=accounts[i][j];
            }
            max=Math.max(max,tempMax);

        }
        return max;

        
    }
}