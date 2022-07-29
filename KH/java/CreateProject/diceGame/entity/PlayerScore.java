package dice.test.sixthExample.diceGame.entity;



import java.util.Arrays;

public class PlayerScore {

    public static String playerTotalScore(int[] playerScore) {
        int findWinnerPlayer = Arrays.binarySearch(playerScore, winnerPlayerScore(playerScore));

        return "🎉승리한 유저는 [" + (findWinnerPlayer + 1) + "번 플레이어] 입니다!🎉 <br>승리한 유저의 점수는 [" +
                winnerPlayerScore(playerScore) + "] 점 입니다!<br>======================================================<br>";
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
