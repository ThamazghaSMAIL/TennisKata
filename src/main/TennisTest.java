package main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TennisTest {

	Tennis tenis;
	@Before 
	public void setUp(){
		tenis = new Tennis();
	}

	@Test
	public void shouldReturnLoveDeuceWhenGameStart() {
		assertEquals("Deuce", tenis.getResult());
	}
	
	@Test
	public void shouldReturnFifteenLoveWhenPlayer1Score() {
		tenis.player1score();
		assertEquals("15-0", tenis.getResult());
	}
	
	@Test
	public void shouldReturnLoveFifteenWhenPlayer2Score() {
		tenis.player2score();
		assertEquals("0-15", tenis.getResult());
	}
	
	@Test
	public void shouldReturnDeuceWhenPlayer1AndPlayer2ScoreTwoPointEach() {
		tenis.player1score();
		tenis.player2score();
		tenis.player1score();
		tenis.player2score();
		assertEquals("Deuce", tenis.getResult());
	}
	
	@Test
	public void shouldReturnAdvantageWhenPlayer2ReachAdvantagePhase() {
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		assertEquals("Advantage for Player 2", tenis.getResult());
	}
	
	@Test
	public void shouldReturnPlayer1WinWhenPlayer1Win() {
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		assertEquals("Player 1 Win", tenis.getResult());
	}
	
	@Test
	public void shouldReturnPlayer2WinWhenPlayer2Win() {
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		assertEquals("Player 2 Win", tenis.getResult());
	}
	
	@Test
	public void shouldReturnDeuceWhenPlayer1WinWhenFourty() {
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		assertEquals("Player 1 Win", tenis.getResult());
	}
	
	@Test
	public void shouldReturnAdvantageWhenPlayer1ReachAdvantagePhase() {
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		
		assertEquals("Advantage for Player 1", tenis.getResult());
	}
	
	@Test
	public void shouldReturnDeuceWhenPlayer1WhenLostAdvantage() {
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player2score();
		
		assertEquals("Deuce", tenis.getResult());
	}
	
	@Test
	public void shouldReturnPlayer1WinWhenPlayer1ScoreAfterDeuce() {
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player2score();
		
		tenis.player1score();
		tenis.player1score();

		assertEquals("Player 1 Win", tenis.getResult());
	}
	
	@Test
	public void shouldReturnPlayer2AdvantageWhenPlayer2ScoreAfterDeuce() {
		tenis.player2score();
		tenis.player2score();
		tenis.player2score();
		
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player1score();
		tenis.player2score();
		
		tenis.player2score();

		assertEquals("Advantage for Player 2", tenis.getResult());
	}
}
