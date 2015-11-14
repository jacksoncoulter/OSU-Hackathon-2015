package edu.miami.game.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Player {
	private float x;
	private float y;
	private float width;
	private float height;
	
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
		
		width = 20;
		height = 20;
		
		// get the center of the game board
		float centerX = con.getWidth() / 2;
		float centerY = con.getHeight() / 2;
		
		// the center of the character will be in the center of the screen
		// not the top left of the character
		x = centerX - (width / 2);
		y = centerY - (height / 2);
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
	
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		g.drawImage(image, x, y);
	}
	
	public void update(GameContainer con, StateBasedGame game, int delta) throws SlickException {

	}
}
