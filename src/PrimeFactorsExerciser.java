import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class PrimeFactorsExerciser {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        if (n < 2) {
            return factors;
        }

        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                factors.addAll(generate(i));
                factors.addAll(generate(n/i));
                return factors;
            }
        }

        factors.add(n);
        return factors;

    }

}
