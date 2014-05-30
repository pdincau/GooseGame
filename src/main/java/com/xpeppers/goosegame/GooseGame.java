package com.xpeppers.goosegame;

public class GooseGame {
	
	private String activePlayers = "";

	public String add(String player) {
		String separator = separato();
		activePlayers += separator +  player;
		return "Giocatori: " + activePlayers;
	}

	private String separato() {
		String separator = ", ";
		if (activePlayers.isEmpty()) {
			separator = "";
		}
		return separator;
	}

}
