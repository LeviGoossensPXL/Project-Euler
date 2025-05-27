package problem1_10;

import helpers.EulerSolution;

public class Solution1 implements EulerSolution {


    /**
     * @return sum from multiples of given numbers
     */
    @Override
    public String run() {
        var outcome = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                outcome += i;
                continue;
            }
            if (i % 5 == 0) {
                outcome += i;
            }
        }
        return String.valueOf(outcome);
    }
}
