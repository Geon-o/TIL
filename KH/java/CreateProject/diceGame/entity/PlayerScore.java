package dice.test.sixthExample.diceGame.entity;



import java.util.Arrays;

public class PlayerScore {

    public static String playerTotalScore(int[] playerScore) {
        int findWinnerPlayer = Arrays.binarySearch(playerScore, winnerPlayerScore(playerScore));

        return "πμΉλ¦¬ν μ μ λ [" + (findWinnerPlayer + 1) + "λ² νλ μ΄μ΄] μλλ€!π <br>μΉλ¦¬ν μ μ μ μ μλ [" +
                winnerPlayerScore(playerScore) + "] μ  μλλ€!<br>======================================================<br>";
    }

    public static int winnerPlayerScore(int[] playerScore) {
        int playerMaxScore = 0;

        for (int i = 0; i < playerScore.length; i++) {
            if (playerScore[i] >= playerMaxScore) {
                playerMaxScore = playerScore[i];
            }
        }
        return playerMaxScore;
    }
}
