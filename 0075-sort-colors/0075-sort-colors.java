class Solution {
    public void sortColors(int[] nums) {
        int s=0,e=nums.length-1;
        //  [0, 0, 2, 1, 1, 2]
        for(int i=0;((i <= e) && (s < e));){
            
            
            if(nums[i]==0){
                nums=swap(nums,i,s);
                //System.out.println("Arrray after swap"+nums[i]+" "+ nums[s]);
               // System.out.println(Arrays.toString(nums));
                s++;
                i++;  
              
            }
           else if(nums[i]==2){
                nums=swap(nums,i,e);
                e--;
            }
            else if(nums[i]==1){
                i++;
            }
           System.out.println("i "+i+" s "+s+" e "+e);
           System.out.println(Arrays.toString(nums));


        }
    }
    public int[] swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;

    }
}