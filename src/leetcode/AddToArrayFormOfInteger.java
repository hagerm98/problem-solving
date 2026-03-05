package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {

            if (k == 0 && carry == 0) {
                result.addFirst(num[i]);
                continue;
            }

            int sum = num[i] + (k % 10) + carry;
            num[i] = sum % 10;
            carry = sum / 10;

            k /= 10;
            result.addFirst(num[i]);
        }

        while (k > 0 || carry > 0) {
            int sum = (k % 10) + carry;
            int digit = sum % 10;
            carry = sum / 10;

            result.addFirst(digit);
            k /= 10;
        }

        return result;
    }
}
