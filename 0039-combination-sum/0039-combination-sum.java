class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
List<List<Integer>> arrList = new ArrayList<List<Integer>>();
    List<Integer> ds = new ArrayList<>();
    return CombinationSum(0,0,ds,target,candidates,arrList);
    }
    public static List<List<Integer>> CombinationSum(int ind,int currentSum,List<Integer> ds,int k,int[] arr,List<List<Integer>> arrList){
        if(ind>arr.length-1){
            return arrList ;
        }
        if(currentSum==k){
            arrList.add(new ArrayList(ds));
            System.out.println(ds);
            return arrList;
        }
        if((k-currentSum)>=arr[ind]){
            ds.add(arr[ind]);
            
            currentSum+=arr[ind];
            CombinationSum(ind,currentSum,ds,k,arr,arrList);
            ds.remove(ds.size()-1);
            currentSum-=arr[ind];
        }
        CombinationSum(ind+1,currentSum,ds,k,arr,arrList);
        return arrList;
    }
}