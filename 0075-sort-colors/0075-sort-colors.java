class Solution {
    public void sortColors(int[] nums) {
        int s=0,e=nums.length-1;
        //  [0, 0, 2, 1, 1, 2]
        int i=0;
        while((i <= e) && (s < e)){
            
            
            if(nums[i]==0){
                
                int temp=nums[i];
                nums[i]=nums[s];
                nums[s]=temp;
                //System.out.println("Arrray after swap"+nums[i]+" "+ nums[s]);
               // System.out.println(Arrays.toString(nums));
                s++;
                i++;  
              
            }
           else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[e];
                nums[e]=temp;
                e--;
            }
            else if(nums[i]==1){
                i++;
            }
           System.out.println("i "+i+" s "+s+" e "+e);
           System.out.println(Arrays.toString(nums));


        }
    }
   
}