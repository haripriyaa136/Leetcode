class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStk = new Stack<Integer>();
        Stack<String> resStk = new Stack<String>();
        int ind=0;
        String res="";
        while(ind<s.length()){
           
            if(Character.isDigit(s.charAt(ind))){
                 int count=0;
                while(Character.isDigit(s.charAt(ind))){
                    count=(count*10) + (s.charAt(ind)-'0');
                    ind++;

                }
                countStk.push(count);

            }
            else if(s.charAt(ind)=='['){
                resStk.add(res);
                res="";
                ind++;
            }
            else if(s.charAt(ind)==']'){
                int tillThis = countStk.pop();
                StringBuilder temp = new StringBuilder(resStk.pop());
                for(int i=0;i<tillThis;i++){
                    temp.append(res);
                }
                res=temp.toString();
                ind++;
            }
            else{
                res+=s.charAt(ind);
                ind++;
            }



        } 
        return res;
        
    }
}