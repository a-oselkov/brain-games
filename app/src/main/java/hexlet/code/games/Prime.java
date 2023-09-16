package hexlet.code.games;

import hexlet.code.Gameable;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Prime implements Gameable {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String YES = "yes";
    private static final String NO = "no";
    private int number;
    @Override
    public RoundData getRoundData() {
        return new RoundData(generateQuestion(), generateAnswer());
    }

    @Override
    public String generateQuestion() {
        number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
        return String.valueOf(number);
    }

    @Override
    public String generateAnswer() {
        if (number == 1) {
            return NO;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return NO;
            }
        }
        return YES;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
