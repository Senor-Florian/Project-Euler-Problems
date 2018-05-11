/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
*/

import java.math.BigInteger;

public class Problem15 {

    public BigInteger calculateRoutes(int a, int b) {
        return calculateFactorial(a + b).divide(calculateFactorial(a)).divide(calculateFactorial(b));
    }

    public BigInteger calculateFactorial(int number) {
        BigInteger factorial = new BigInteger("1");
        for(int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
