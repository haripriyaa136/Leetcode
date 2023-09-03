import java.util.Arrays;
class SortColors {
    /*
    If you are going to swap two elements if the i th element is 2 then, don't use swap instead assign the number(i.e not 2) to the variable (i.e variable with value 2) you want to swap.
And assign that variable(i.e variable not 2) to 2.
   nums[currentIndex] = nums[end];
   nums[end] = 2;
    * (i<nums.length) && (i<=e) Here second condition itself is enough to make both the conditions satisfy.

   Don't return an array in swap method. Use void.

 */
    public static void main(String args[]){
        int arr[]={0,2,0,1,0,1,2};
        sortColors(arr);
    }
    public static void sortColors(int[] nums) {
        int s=0,e=nums.length-1;
        for(int i=0;((i<nums.length) && (i<=e));){
            if(nums[e]==2){
                e--;
            }

            if(nums[i]==0){
                nums=swap(nums,i,s);
                s++;
                i++;
            }
            else if(nums[i]==2 && (i<e) && (nums[e]!=2)){
                nums=swap(nums,i,e);
                e--;
            }
            else if(nums[i]==1){
                i++;
            }
        }
        System.out.println("Sorted array "+Arrays.toString(nums));
    }
    public static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}