/*

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Problem2 {

    public long sumOfEvenFiboNumber() {
        long a = 1;
        long b = 2;
        long c = 0;
        long sum = 2;
        for(int i = 2; i < 10000000; i++) {
            c = a + b;
            if(c > 4000000) {
                break;
            }
            if(c % 2 == 0) {
                sum += c;
            }
            a = b;
            b = c;
        }
        return sum;
    }
}
