class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=Integer.MIN_VALUE;
        int maxTillNow = 0;
        for(int i=0;i<nums.length;i++){
            maxTillNow+=nums[i];
            maxSoFar=Math.max(maxTillNow,maxSoFar);
            if(maxTillNow<0){
                maxTillNow=0;
            }
        }
        return maxSoFar;
    }
}