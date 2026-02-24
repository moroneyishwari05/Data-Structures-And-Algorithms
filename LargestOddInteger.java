//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.


class Solution {
    public String largestOddNumber(String num) {

        // Traverse from right to left
        for(int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            // Check if digit is odd
            if((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";   // if no odd digit found
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        String num = "35427";
        System.out.println(sol.largestOddNumber(num));
    }
}
