class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverseArray(nums,0,nums.length-k-1);
        reverseArray(nums,nums.length-k,nums.length-1);
        reverseArray(nums,0,nums.length-1);
           
    }
    public void reverseArray(int[]nums,int s,int e){
        
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            e--;
            s++;
        }
    }
}