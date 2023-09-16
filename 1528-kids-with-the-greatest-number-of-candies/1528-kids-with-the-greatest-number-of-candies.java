class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean> boolArray = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                boolArray.add(true);
            }
            else{
                boolArray.add(false);
            }
            
        }
        return boolArray;
    }
}