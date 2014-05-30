package com.xpeppers.goosegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GooseGameTest {

	private GooseGame game;

	@Before
	public void setUp() {
		game = new GooseGame();		
	}
	
	@Test
	public void addPlayerReturnsPlayer() {
		assertEquals("Giocatori: Pippo", game.add("Pippo"));
	}

	@Test
	public void addTwoPlayersReturnsPlayers() {
		game.add("Pippo");
		
		assertEquals("Giocatori: Pippo, Pluto", game.add("Pluto"));
	}

}