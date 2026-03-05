package leetcode;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        }

        int steps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }

            steps++;
        }

        return steps;
    }

    public int NumberOfStepsBitManipulation(int num) {

        if (num == 0) {
            return 0;
        }

        int steps = 0;

        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }

             steps++;
        }

        return steps;
    }
}
