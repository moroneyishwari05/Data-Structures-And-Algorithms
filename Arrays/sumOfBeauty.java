//The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
//For example, the beauty of "abaacc" is 3 - 1 = 2.
//Given a string s, return the sum of beauty of all of its substrings.

class Solution {
    public int beautySum(String s) {
        
        int sumOfBeauty = 0;
        
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int f : freq){
                    if(f > 0){
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                sumOfBeauty += (maxFreq - minFreq);
            }
        }

        return sumOfBeauty;
    }
}
