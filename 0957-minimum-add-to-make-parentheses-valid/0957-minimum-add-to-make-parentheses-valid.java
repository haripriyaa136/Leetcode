class Solution {
    public int minAddToMakeValid(String s) {
          HashMap<Character,Character> hm = new HashMap<>();
          int c=0;
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character> stk = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stk.add(ch);
            }
            else{
                if(stk.isEmpty() || hm.get(ch)!=stk.pop()){
                   c++;
                } 
               
                
            }
        }
        
       
     return c+stk.size();
    }
}