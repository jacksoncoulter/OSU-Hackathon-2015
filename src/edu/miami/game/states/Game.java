package edu.miami.game.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
	public static final String GAME_TITLE = "Game";
	
	private GamePlayState gameState;
	
	public Game() {
		super(GAME_TITLE);
		
		gameState = new GamePlayState();
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		addState(gameState);
	}
}
