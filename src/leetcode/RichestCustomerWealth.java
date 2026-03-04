package leetcode;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bankAccount : customer) {
                currentCustomerWealth += bankAccount;
            }

            maxWealth = Math.max(maxWealth, currentCustomerWealth);
        }

        return maxWealth;
    }
}
