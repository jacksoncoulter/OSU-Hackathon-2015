package edu.miami.game.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import edu.miami.game.states.Game;

public class Main {
	private AppGameContainer app;
	
	public Main() {
		try {
			app = new AppGameContainer(new Game());
			app.setDisplayMode(500, 500, false);
			app.start();
		} catch (SlickException e) {
			
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
