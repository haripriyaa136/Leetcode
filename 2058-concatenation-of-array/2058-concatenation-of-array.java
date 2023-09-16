class Solution {
    public int[] getConcatenation(int[] nums) {
        int temp[]= new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            temp[i]=nums[i%nums.length];
        }
        return temp;
        
    }
}