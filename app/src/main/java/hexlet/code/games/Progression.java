package hexlet.code.games;

import hexlet.code.Gaming;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Progression implements Gaming {
    private static final int MAX_MISSING_NUMBER_PLEASE = 9;
    private static final int MAX_STEP_PROGRESSION = 10;
    private String answer;
    @Override
    public RoundData makeGame() {
        String progression = getProgression();
        String question = String.valueOf(progression);
        return new RoundData(question, answer);
    }
    private String getProgression() {
        StringBuilder progression = new StringBuilder();
        int fistNumberProgression = Utils.generateRandomNumber();
        int step = Utils.generateRandomNumber(1, MAX_STEP_PROGRESSION);
        int missingNumberPlace = Utils.generateRandomNumber(0, MAX_MISSING_NUMBER_PLEASE);

        for (int i = 0; i < missingNumberPlace; i++) {
            progression.append(fistNumberProgression).append(" ");
            fistNumberProgression += step;
        }

        progression.append(".. ");
        answer = String.valueOf(fistNumberProgression);
        fistNumberProgression += step;

        for (int i = missingNumberPlace; i < MAX_MISSING_NUMBER_PLEASE; i++) {
            progression.append(fistNumberProgression).append(" ");
            fistNumberProgression += step;
        }
        return String.valueOf(progression);
    }
}
