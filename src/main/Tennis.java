package main;

public class Tennis {

	public Tennis() {
		scorePlayer2 = 0;
		scorePlayer1 = 0;
		playerwin = 0;
	}
	private int scorePlayer1;
	private int scorePlayer2;

	private int playerwin;

	public String getResult() {
		if (playerwin > 0)
			return "Player "+ playerwin+ " Win";

		int advantageResult = calculAdvantage();
		if (advantageResult > 0)
			return "Advantage for Player "+advantageResult;

		if (scorePlayer1 != scorePlayer2)
			return convertScore(scorePlayer1) + "-" + convertScore(scorePlayer2);

		return "Deuce";
	}


	private String convertScore(int score) {
		if (score == 1)
			return "15";
		else if (score == 2)
			return "30";
		else if (score == 3)
			return "40";
		return "0";
	}

	public void player1score() {
		if ( playerwin == 0 )
			scorePlayer1++;

		calculWin();
	}

	public void player2score() {
		if (playerwin == 0)
			scorePlayer2++;

		calculWin();
	}

	private int calculAdvantage() {
		if (scorePlayer1 >= 4 && scorePlayer1 - scorePlayer2 ==1 )
			return 1;
		if (scorePlayer2 >= 4 && scorePlayer2 - scorePlayer1 ==1)
			return 2;

		return 0;
	}

	private void calculWin() {
		if( scorePlayer1 >= 4 && scorePlayer1 - scorePlayer2 >= 2 )
			playerwin = 1;

		if( scorePlayer2 >= 4 && scorePlayer2 - scorePlayer1 >= 2)
			playerwin = 2;
	}

}
