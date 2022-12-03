class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)) )
            {         
                if(i<s.length()/2)
            {
                c1++;
            }
            else
            {
                c1--;
            }
        }
        }
        
       return (c1==0);
        
    }
}