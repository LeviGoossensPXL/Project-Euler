package problem1_10;

import helpers.EulerSolution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 implements EulerSolution {


    /**
     * @return sum from multiples of given numbers
     */
    @Override
    public String run() {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>(Arrays.asList(1, 2));
        int fibonacciNumber = 0;
        while (fibonacciNumber < 4_000_000) {
            fibonacciNumber = fibonacciSequence.getLast() + fibonacciSequence.get(fibonacciSequence.size() - 2);
            fibonacciSequence.add(fibonacciNumber);
        }
//        var result = fibonacciSequence.stream().reduce(0, (acc, next) -> acc + next);
        var result = fibonacciSequence.stream().filter(i -> (i % 2 == 0)).reduce(0, Integer::sum);
        return result.toString();
    }
}
