package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Gaming;
import hexlet.code.RoundInfo;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.ROUND_INFO;

public class Even implements Gaming {
    @Override
    public void makeGame() {
        Engine.RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String answer;
        String question;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int number = Utils.generateRandomNumber();
            question = String.valueOf(number);
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            ROUND_INFO[i] = new RoundInfo(question, answer);
        }
    }
}

