package leetcode;

public class ReverseString {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char currentChar = s[left];
            s[left] = s[right];
            s[right] = currentChar;

            left++;
            right--;

        }
    }
}
