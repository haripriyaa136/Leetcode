class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0,c2=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(Arrays.asList('A','a','e','E','I','i','O','o','U','u').contains(s.charAt(i)) )
{         
                if(i<s.length()/2)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        }
        
        if(c1==c2)
        {
            return true;
        }
        return false;
    }
}