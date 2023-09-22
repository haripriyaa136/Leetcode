class Solution {
    public List<List<Integer>> generate(int numRows) {
List<List<Integer>> li = new ArrayList<List<Integer>>(numRows);
       int intialArrSize=1;
        for(int j=0;j<numRows;j++){
            List<Integer> l = new ArrayList<>(intialArrSize);
            
            for(int i=0;i<intialArrSize;i++){

                if(i==0 || i==intialArrSize-1){
                    l.add(i,1);
                }
                else{
        l.add(i,(li.get(j-1).get(i-1)+li.get(j-1).get(i)));
                }
            }
            intialArrSize++;
            li.add(l);
            
        } 
        return li;
    }
}