class Solution {
    public int[] buildArray(int[] nums) {
       // The approach used here is keeping two numbers together.
       // Euclid's division algorithm
       // divident = (divisor * quotient) + remainder
       // [5,0,1,2,3,4] 
       // nums[0] should be nums[nums[0]](Requirement).
       // nums[0] => oldValue + nums.length*(newValue%nums.length)
       // nums[0] => 5 + 6*(4%6) ; => value is 29
       // nums[1] => 0 + 6*(29%6); = value is 30 
       // similarly calculate for all numbers and atlast traverse the array 
       // and keep the new value by using nums[0]/nums.length;
       for(int i=0;i<nums.length;i++){
           nums[i]=nums[i]+nums.length*(nums[nums[i]]%nums.length);
       }
       for(int i=0;i<nums.length;i++){
           nums[i]=nums[i]/nums.length;
       }
       return nums;
    }
}