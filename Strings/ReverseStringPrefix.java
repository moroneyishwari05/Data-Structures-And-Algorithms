/*You are given a string s and an integer k.

Reverse the first k characters of s and return the resulting string.
*/
class Solution {
    public String reversePrefix(String s, int k) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = k - 1;

        while(left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
