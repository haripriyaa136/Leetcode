class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s=0,e=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                ans[s]=nums[i];
                s++;
            }
            if(nums[j]>pivot){
                ans[e]=nums[j];
                e--;
            }
        }
        while(s<=e){
            ans[s]=pivot;
            s++;
        }
        return ans;
    }
}