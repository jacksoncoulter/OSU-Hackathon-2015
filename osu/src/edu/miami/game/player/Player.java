package edu.miami.game.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

import edu.miami.game.map.Tile;

public class Player {
	private float x;
	private float y;
	private float drawX;
	private float drawY;
	private float width;
	private float height;
	private float hitboxMarginX;
	private float hitboxMarginY;
	private float speed;
	
	private int mapDrawX;
	private int mapDrawY;
	
	private int leftKey;
	private int rightKey;
	private int upKey;
	private int downKey;
	
	private Image image;
	
	public Player(GameContainer con) {
		try {
			image = new Image("res/images/player.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
		leftKey = Input.KEY_A;
		rightKey = Input.KEY_D;
		upKey = Input.KEY_W;
		downKey = Input.KEY_S;
		
		width = image.getWidth();
		height = image.getHeight();
		
		hitboxMarginX = 5;
		hitboxMarginY = 5;
		
		speed = 4;
		
		// get the center of the game board
		float centerX = con.getWidth() / 2;
		float centerY = con.getHeight() / 2;
		
		// the center of the character will be in the center of the screen
		// not the top left of the character
		drawX = centerX - (width / 2);
		drawY = centerY - (height / 2);
		
		// the map will be drawn at location (0,0) when the game starts
		mapDrawX = 0;
		mapDrawY = 0;
		
		setPosition(drawX, drawY);
	}
	
	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public int getMapX() {
		return mapDrawX;
	}
	
	public int getMapY() {
		return mapDrawY;
	}
	
	public int getLeftKey() {
		return leftKey;
	}
	
	public int getRightKey() {
		return rightKey;
	}
	
	public int getUpKey() {
		return upKey;
	}
	
	public int getDownKey() {
		return downKey;
	}
	
	private void processMovement(Input input, TiledMap map) {
		if (input.isKeyDown(leftKey)) {
			moveLeft(map);
		} else if (input.isKeyDown(rightKey)) {
			moveRight(map);
		}
		
		if (input.isKeyDown(upKey)) {
			moveUp(map);
		} else if (input.isKeyDown(downKey)) {
			moveDown(map);
		}
	}
	
	public void moveLeft(TiledMap map) {
		for (int i = 0; i < speed; i++) {
			float newX = (x + hitboxMarginX) - 1;

			int tileX = (int) newX / 20;
			int tileTopY = (int) (y + hitboxMarginY) / 20;
			int tileBottomY = (int) (y + height - hitboxMarginY) / 20;
			
			int tileTopId = map.getTileId(tileX, tileTopY, 1);
			int tileBottomId = map.getTileId(tileX, tileBottomY, 1);
			
			if (Tile.tileIsSolid(tileTopId) || Tile.tileIsSolid(tileBottomId)) {
				return;
			}
			
			x--;
			mapDrawX++;
		}
	}
	
	public void moveRight(TiledMap map) {
		for (int i = 0; i < speed; i++) {
			float newX = (x + width - hitboxMarginX) + 1;
	
			int tileX = (int) newX  / 20;
			int tileTopY = (int) (y + hitboxMarginY) / 20;
			int tileBottomY = (int) (y + height - hitboxMarginY) / 20;
			
			int tileTopId = map.getTileId(tileX, tileTopY, 1);
			int tileBottomId = map.getTileId(tileX, tileBottomY, 1);
			
			if (Tile.tileIsSolid(tileTopId) || Tile.tileIsSolid(tileBottomId)) {
				return;
			}
			
			x++;
			mapDrawX--;
		}
	}
	
	public void moveUp(TiledMap map) {
		for (int i = 0; i < speed; i++) {
			float newY = (y + hitboxMarginY) - 1;
	
			int tileY = (int) newY / 20;
			int tileLeftX = (int) (x + hitboxMarginX) / 20;
			int tileRightX = (int) (x + width - hitboxMarginX) / 20;
			
			int tileLeftId = map.getTileId(tileLeftX, tileY, 1);
			int tileRightId = map.getTileId(tileRightX, tileY, 1);
			
			if (Tile.tileIsSolid(tileLeftId) || Tile.tileIsSolid(tileRightId)) {
				return;
			}
			
			y--;
			mapDrawY++;
		}
	}
	
	public void moveDown(TiledMap map) {
		for (int i = 0; i < speed; i++) {
			float newY = (y + height - hitboxMarginY) + 1;
	
			int tileY = (int) newY / 20;
			int tileLeftX = (int) (x + hitboxMarginX) / 20;
			int tileRightX = (int) (x + width - hitboxMarginX) / 20;
			
			int tileLeftId = map.getTileId(tileLeftX, tileY, 1);
			int tileRightId = map.getTileId(tileRightX, tileY, 1);
			
			if (Tile.tileIsSolid(tileLeftId) || Tile.tileIsSolid(tileRightId)) {
				return;
			}
			
			y++;
			mapDrawY--;
		}
	}
	
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		g.drawImage(image, drawX, drawY);
	}
	
	public void update(GameContainer con, StateBasedGame game, int delta, TiledMap map) throws SlickException {
		processMovement(con.getInput(), map);
	}
}
