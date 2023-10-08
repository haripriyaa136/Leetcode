class Solution {
    public String removeStars(String s) {
        String str="";
        Stack<Character>  stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        while(stk.size()!=0){
            str=stk.pop()+str;
        }
        return str;
        
    }
}