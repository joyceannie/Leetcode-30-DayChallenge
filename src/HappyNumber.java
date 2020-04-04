import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> values = new HashSet<>();
        values.add(n);
        while (n!=1) {
            int squareSum = 0;
            while (n!=0) {
                int remainder = n%10;
                n = n/10;
                squareSum += remainder * remainder;
            }
            if (values.contains(squareSum)) {
                return false;
            }
            values.add(squareSum);
            n = squareSum;
        }
        return true;
    }
}
