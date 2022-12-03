class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int vowelsCount = 0, midIndex = s.length() / 2;

        for (int i = 0; i < midIndex; i++) {
           
            if (vowels.contains(s.charAt(i))) vowelsCount++;
            if (vowels.contains(s.charAt(midIndex + i))) vowelsCount--;
        }
        return vowelsCount == 0;
    }
}
