class Solution {
    public boolean halvesAreAlike(String s) {
      List<Character> set=Arrays.asList('a','A','e','E','i','I','o','O','u','U');
		//find the mid
        int mid = s.length() / 2;
        int count = 0;
        //increment the count for left half, decrement count for the second half if its a vowel
		for (int i = 0; i < s.length(); i++)
            count += (set.contains(s.charAt(i))) ? ((i < mid) ? 1 : -1) : 0; 
        //finally count should be 0 to match left and right half
		return count == 0;
    }
}