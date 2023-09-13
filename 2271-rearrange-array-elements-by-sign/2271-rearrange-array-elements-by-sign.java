class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int l=0,e=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[l]=nums[i];
                l+=2;
            }
             if(nums[i]<0){
                arr[e]=nums[i];
                e+=2;
            }

        }
        return arr;
        
    }
}