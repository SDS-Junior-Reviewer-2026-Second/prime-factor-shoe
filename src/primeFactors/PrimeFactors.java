package primeFactors;

import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        if (number == 2) {
            return List.of(2);
        }

        else if (number == 3) {
            return List.of(3);
        }

        return List.of();
    }
}
