class Solution {
    public int maxArea(int[] height) {

      /*
      //This is  first approach I tried.
        int len=height.length,max=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                max= Math.max((j-i)*Math.min(height[j],height[i]),max);
            }


        }*/

        //This one is using Two pointers
        int len=height.length,max=0;
        int i=0,j=height.length-1;
        while(i<j){
            max= Math.max((j-i)*Math.min(height[j],height[i]),max);
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
                j--;
            }

        }

        return max;
        
    }
}