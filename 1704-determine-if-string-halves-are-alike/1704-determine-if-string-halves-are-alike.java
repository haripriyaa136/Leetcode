class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0,mid=s.length()/2;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
           c1 += (set.contains(a) ? ((i < mid) ? 1 : -1) : 0);
           
        }
        
       return (c1==0);
        
    }
}