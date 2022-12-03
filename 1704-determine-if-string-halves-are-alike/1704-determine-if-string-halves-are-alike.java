class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0,c2=0;
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        for(int i=0;i<a.length();i++)
        {
            if(Arrays.asList('A','a','e','E','I','i','O','o','U','u').contains(a.charAt(i)) )
            {
                c1++;
            }
        }
        for(int i=0;i<b.length();i++)
        {
            if(Arrays.asList('A','a','e','E','I','i','O','o','U','u').contains(b.charAt(i)) )
            {
                c2++;
            }
        }
        if(c1==c2)
        {
            return true;
        }
        return false;
    }
}