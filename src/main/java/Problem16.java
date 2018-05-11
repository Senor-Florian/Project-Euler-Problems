import java.math.BigInteger;
import java.util.ArrayList;

public class Problem16 {

    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public BigInteger sumOfDigits(double number) {
        ArrayList<Double> digitArray = new ArrayList<>();
        do{
            digitArray.add(number % 10);
            number /= 10;
        } while  (number > 0);
        BigInteger sum = new BigInteger("0");
        for(double digit: digitArray) {
            sum = sum.add(BigInteger.valueOf((long)digit));
        }
        return sum;
    }

    public BigInteger sum(int base, int exponent) {
        BigInteger result = BigInteger.ZERO;
        BigInteger ten = new BigInteger("10");
        BigInteger number = new BigInteger(String.valueOf(base)).pow(exponent);
        while (number.compareTo(BigInteger.ZERO) == 1) {
            result = result.add(number.remainder(ten));
            number = number.divide(ten);
        }
        return result;
    }
}
