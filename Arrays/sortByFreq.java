//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.


class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }

        // Convert map to list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : list){
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0; i < freq; i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
