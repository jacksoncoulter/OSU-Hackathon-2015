package edu.miami.game.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

import edu.miami.game.player.Player;

public class GamePlayState extends BasicGameState {
	private int mapX;
	private int mapY;
	
	private TiledMap map;
	
	private Player player;
	
	private void processMovement(Input input) {
		if (input.isKeyDown(player.getLeftKey())) {
			playerMoveLeft();
		} else if (input.isKeyDown(player.getRightKey())) {
			playerMoveRight();
		}
		
		if (input.isKeyDown(player.getUpKey())) {
			playerMoveUp();
		} else if (input.isKeyDown(player.getDownKey())) {
			playerMoveDown();
		}
	}
	
	private void playerMoveLeft() {
		mapX++;
	}
	
	private void playerMoveRight() {
		mapX--;
	}
	
	private void playerMoveUp() {
		mapY++;
	}
	
	private void playerMoveDown() {
		mapY--;
	}
	
	private void resetMap() {
		mapX = 0;
		mapY = 0;
	}

	@Override
	public void init(GameContainer con, StateBasedGame game) throws SlickException {
		resetMap();
		
		map = new TiledMap("res/map.tmx");
		
		player = new Player(con);
	}

	@Override
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		map.render(mapX, mapY);
		
		player.render(con, game, g);
	}
	
	@Override
	public void update(GameContainer con, StateBasedGame game, int delta) throws SlickException {
		// first, let the player process any input
		player.update(con, game, delta);
		
		Input input = con.getInput();
		
		// move the player (actually the map) if we need to
		processMovement(input);
	}

	@Override
	public int getID() {
		return 0;
	}

}
