class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int val;
        if(ruleKey.equals("type")){
            val=0;
        }
        else if(ruleKey.equals("color")){
            val=1;

        }
        else{
            val=2;
        }
        for(List<String> li : items){
            if(li.get(val).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}