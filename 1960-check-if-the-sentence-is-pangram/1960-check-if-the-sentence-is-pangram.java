class Solution {
    public boolean checkIfPangram(String sentence) {
// I tried using hashset - I got 3 ms , 
//  Next approach : by traversing through all characters , with array of
//  boolean where we store the array element as true if the char is present
// boolArray[ch-'a']= true  
// Then traverse through the boolean array and check if any element is false 
   // => Third Approach :
   for(char ch ='a';ch<='z';ch++){
       if(!sentence.contains(String.valueOf(ch))){
           return false;
       }
   }
   
   return true;
   
    }
}