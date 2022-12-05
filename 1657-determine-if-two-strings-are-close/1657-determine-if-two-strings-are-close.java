class Solution {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> set1 =new HashSet<>();
        Set<Character> set2 =new HashSet<>();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(char ch : word1.toCharArray())
        {
            set1.add(ch);
        }
        for(char ch : word2.toCharArray())
        {
            set2.add(ch);
        }
        if(!set1.equals(set2))
        {
            return false;
        }
        for(char ch:word1.toCharArray())
        {
            arr1[ch-'a']++;
        }
        for(char ch:word2.toCharArray())
        {
            arr2[ch-'a']++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(!Arrays.equals(arr1,arr2))
        {
            return false;
        }
        return true;
   
    }
}