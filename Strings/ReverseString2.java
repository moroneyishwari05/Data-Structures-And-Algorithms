/*Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
*/
class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for(int start = 0; start < arr.length; start += 2 * k) {

            int left = start;

            int right = Math.min(start + k - 1, arr.length - 1);

            while(left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
