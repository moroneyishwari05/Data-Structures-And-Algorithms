/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        for(int i = words.length - 1; i >= 0 ; i--){
            if(words[i].length() > 0 ){
                return words[i].length();
            }
        }
        return 0;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        String s = "Hello World";
        int len = sol.lengthOfLastWord(s); 
    }
}
