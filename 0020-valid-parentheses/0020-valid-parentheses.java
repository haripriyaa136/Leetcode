class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character> stk = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stk.add(ch);
            }
            else{
                if(stk.isEmpty() || hm.get(ch)!=stk.peek()){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
        }
        if(!stk.isEmpty()){
            return false;
        }
        return true;
        
    }
}