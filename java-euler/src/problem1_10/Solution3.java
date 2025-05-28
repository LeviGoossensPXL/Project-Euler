package problem1_10;

import helpers.EulerSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 implements EulerSolution {


    /**
     * @return sum from multiples of given numbers
     */
    @Override
    public String run() {
        var primes = getPrimeFactors(600_851_475_143L).stream().toList();
        return primes.getLast().toString();
    }

    private ArrayList<Long> getPrimeFactors(long n) {
        ArrayList<Long> primeFactors = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            if (i % n == 0) {
                primeFactors.add(i);
                break;
            }
            if (n % i == 0) {
                primeFactors.add(i);
                primeFactors.addAll(getPrimeFactors(n / i)); // use recursion
                break;
            }
        }
        return primeFactors;
    }
}
