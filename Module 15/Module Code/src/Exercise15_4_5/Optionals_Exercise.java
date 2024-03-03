package Exercise15_4_5;

import java.util.Optional;
import java.util.Random;

public class Optionals_Exercise {
    static Optional<String> checkGuess(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException();
        } else {
            int result = new Random().nextInt(5) + 1;
            System.out.println(result);

            if (result == guess)
                return Optional.of("Congrats, you got the right value.");
            else
                return Optional.empty();
        }
    }
}
