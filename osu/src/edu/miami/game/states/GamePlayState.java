package edu.miami.game.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

import edu.miami.game.map.Tile;
import edu.miami.game.player.Player;

public class GamePlayState extends BasicGameState {
	private TiledMap map;
	
	private Player player;
	
	@Override
	public void init(GameContainer con, StateBasedGame game) throws SlickException {
		map = new TiledMap("res/map.tmx");
		
		Tile.parseMap(map);
		
		player = new Player(con);
	}

	@Override
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		// the actual draw position of the map will be determined by the
		// location of the player on the map
		map.render(player.getMapX(), player.getMapY());

		// let the player draw itself
		player.render(con, game, g);
	}
	
	@Override
	public void update(GameContainer con, StateBasedGame game, int delta) throws SlickException {
		// first, let the player process any input
		player.update(con, game, delta, map);
	}

	@Override
	public int getID() {
		return 0;
	}

}
