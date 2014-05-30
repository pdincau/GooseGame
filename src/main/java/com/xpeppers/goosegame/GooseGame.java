package com.xpeppers.goosegame;

public class GooseGame {
	
	private String activePlayers = "";

	public String add(String player) {
		String separator = separator();
		activePlayers += separator +  player;
		return "Giocatori: " + activePlayers;
	}

	private String separator() {
		String separator = ", ";
		if (activePlayers.isEmpty()) {
			separator = "";
		}
		return separator;
	}

}
