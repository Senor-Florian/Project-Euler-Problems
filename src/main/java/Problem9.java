/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Problem9 {

    private double[] triplet = new double[3];

    public double[] findTriplet() {
        double a;
        double b;
        double c;
        for(a = 1; a < 1000; a++) {
            for(b = 1; b < 1000; b++) {
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if(a + b + c == 1000) {
                    triplet[0] = a;
                    triplet[1] = b;
                    triplet[2] = c;
                    break;
                }
            }
        }
        return triplet;
    }

    public void printTriplet(double[] triplet) {
        for (double number : triplet) {
            System.out.println(number);
        }
    }
}
