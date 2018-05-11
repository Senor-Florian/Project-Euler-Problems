public class Problem5 {

    private int max = Integer.MAX_VALUE;

    public int getSmallestNumber() {
        for(int i = 1; i < max; i++) {
            if(numberIsDividable(i)) {
                return i;
            }
        }
        return 0;
    }

    public boolean numberIsDividable(int number) {
        for(int i = 1; i <= 20; i++) {
            if(number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
