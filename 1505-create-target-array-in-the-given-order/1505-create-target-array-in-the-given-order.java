class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
              al.add(index[i],nums[i]);
        }
        for(int i=0;i<al.size();i++){

            nums[i]=al.get(i);
        }
        return nums;
      

    }
}