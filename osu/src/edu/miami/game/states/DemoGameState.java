package edu.miami.game.states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class DemoGameState extends BasicGameState {
	private float x;
	private float y;
	private float width;
	private float height;

	@Override
	public void init(GameContainer con, StateBasedGame game) throws SlickException {
		x = 0;
		y = 0;
		width = 10;
		height = 10;
	}

	@Override
	public void render(GameContainer con, StateBasedGame game, Graphics g) throws SlickException {
		g.setColor(Color.green);
		g.fill(new Rectangle(0, 0, con.getWidth(), con.getHeight()));
		
		g.setColor(Color.white);
		g.fill(new Rectangle(x, y, width, height));
	}
	
	private void growVertical(int max) {
		if (y - 1 < 0) {
			return;
		}
		
		if ((y - 1) + (height + 2) > max) {
			return;
		}
		
		height += 2;
		y--;
	}
	
	private void shrinkVertical() {
		if (height - 2 < 1) {
			return;
		}
		
		height -= 2;
		y++;
	}
	
	private void growHorizontal(int max) {
		if (x - 1 < 0) {
			return;
		}
		
		if ((x - 1) + (width + 2) > max) {
			return;
		}
		
		width += 2;
		x--;
	}
	
	private void shrinkHorizontal() {
		if (width - 2 < 1) {
			return;
		}
		
		width -= 2;
		x++;
	}

	@Override
	public void update(GameContainer con, StateBasedGame game, int delta) throws SlickException {
		Input input = con.getInput();
		
		if (input.isKeyDown(Input.KEY_UP)) {
			growVertical(con.getHeight());
		} else if (input.isKeyDown(Input.KEY_DOWN)) {
			shrinkVertical();
		}
		
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			growHorizontal(con.getHeight());
		} else if (input.isKeyDown(Input.KEY_LEFT)) {
			shrinkHorizontal();
		}
				
		if (input.isKeyDown(Input.KEY_W)) {
			if (y - 1 >= 0) {
				y--;
			}
		} else if (input.isKeyDown(Input.KEY_S)) {
			if (y + height + 1 <= con.getHeight()) {
				y++;
			}
		}
			if (input.isKeyDown(Input.KEY_A)) {
			if (x - 1 >= 0) {
				x--;
			}
		} else if (input.isKeyDown(Input.KEY_D)) {
			if (x + width + 1 <= con.getWidth()) {
				x++;
			}
		}
	}

	@Override
	public int getID() {
		return 1;
	}

}
