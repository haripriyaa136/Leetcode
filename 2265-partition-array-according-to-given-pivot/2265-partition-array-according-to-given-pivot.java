class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l=0,g=0,e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l++;
            }
            else if(nums[i]>pivot){
                g++;
            }
            else{
                e++;
            }
        }
        // System.out.println("l "+l);
        // System.out.println("g "+g+" new g "+(e+l+1));
        // System.out.println("e "+e+" new e "+(l+1));
        g=e+l;
        e=l;
        l=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            System.out.println("Now nums "+nums[i]);
            if(nums[i]<pivot){
                arr[l]=nums[i];
                l++;
            }
            else if(nums[i]>pivot){
                arr[g]=nums[i];
                g++;
            }
            else{
                arr[e]=pivot;
                e++;
            }
          //  System.out.println("l and e and g "+l+""+e+""+g);
        }
        return arr;
    }
}