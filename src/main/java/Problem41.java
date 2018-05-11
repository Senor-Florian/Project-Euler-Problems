/*
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
For example, 2143 is a 4-digit pandigital and is also prime.
What is the largest n-digit pandigital prime that exists?
 */

import java.util.Set;
import java.util.TreeSet;

public class Problem41 {

    public long getLargestPandigitalPrime() {
        long number = 1;
        for(long i = 1; i <= 10000000L; i++) {
            if(isPandigital(i) && isPrime(i)) {
                number = i;
            }
        }
        return number;
    }

    public boolean isPandigital(long n){
        Set<Character> set= new TreeSet<>();
        Set<Character> digits = new TreeSet<>();
        String string = n+"";
        for(int i = 1; i <= string.length(); i++) {
            digits.add((char)i);
        }
        for (char c:string.toCharArray()){
            if(c == '0') {
                return false;
            }
            set.add(c);
        }
        return set.size() == string.length();
    }

    public boolean isPrime(long n) {
        if (n % 2 == 0) {
            return false;
        }
        for(long i = 3; i * i <= n; i += 2) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
