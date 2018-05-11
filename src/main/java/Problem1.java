/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    public int findSum() {
        int sum = 0;
        for(int i = 1; i <= 333; i++) {
            sum += 3 * i;
        }
        for(int j = 1; j <= 199; j++) {
            if(5 * j % 3 != 0) {
                sum += 5*j;
            }
        }
        return sum;
    }
}
