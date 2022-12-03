class Solution {
    public boolean halvesAreAlike(String s) {
      List<Character> set =new ArrayList<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
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