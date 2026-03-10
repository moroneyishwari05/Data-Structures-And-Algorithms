// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        //Count the freq of char in s
        for(char c : s.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }

        //Count the freq of char in t
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Compare the two hashmaps now
        return hmap.equals(map);

    }
}
