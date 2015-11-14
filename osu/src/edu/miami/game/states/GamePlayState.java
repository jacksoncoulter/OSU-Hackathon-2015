package edu.miami.game.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class GamePlayState extends BasicGameState {
	private TiledMap map;

	@Override
	public void init(GameContainer con, StateBasedGame game) throws SlickException {
		map = new TiledMap("res/test.tmx");
		
		
	}

	@Override
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		map.render(0, 0);
	}
	
	@Override
	public void update(GameContainer con, StateBasedGame game, int delta) throws SlickException {

	}

	@Override
	public int getID() {
		return 0;
	}

}
