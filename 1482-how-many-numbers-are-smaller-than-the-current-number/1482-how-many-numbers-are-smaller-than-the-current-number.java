class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] res= new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if((i!=j)&&(nums[j]<nums[i])){
        //             res[i]++;
        //         }
        //     }
        // }

        // return res;


        int[] count = new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        System.out.println(Arrays.toString(count));
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=0;
            }
            else{
                nums[i]=count[nums[i]-1]; 
            }
           
        }
        return nums;
    }
}