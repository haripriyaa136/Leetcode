class Solution {
    public int[] runningSum(int[] nums) {
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum = nums[i]+tempSum;
            nums[i]=tempSum;
        }
        
        return nums;
    }
}