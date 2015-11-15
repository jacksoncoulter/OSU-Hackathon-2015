package edu.miami.game.map;

import java.util.ArrayList;
import java.util.Properties;

import org.newdawn.slick.tiled.TileSet;
import org.newdawn.slick.tiled.TiledMap;

public class Tile {
	private int id;
	private int width;
	private int height;
	
	private boolean solid;
	
	private String name;
	
	public static ArrayList<Tile> tiles = new ArrayList<Tile>();
	public static ArrayList<Tile> solidTiles = new ArrayList<Tile>();
	
	public static final String SOLID_PROP_KEY = "solid";
	
	public static final int SOLID = 1;
	
	public void setID(int id) {
		this.id = id;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setSolid(boolean solid) {
		this.solid = solid;
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	
	public static boolean tileIsSolid(int id) {
		for (Tile t : solidTiles) {
			if (t.id == id) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void parseMap(TiledMap map) {
		for (int i = 0; i < map.getTileSetCount(); i++) {
			TileSet set = map.getTileSet(i);
			
			Tile tile = new Tile();
			tile.setID(set.firstGID);
			tile.setWidth(set.getTileWidth());
			tile.setHeight(set.getTileHeight());
			tile.setSolid(false);
			tile.setName(set.name);
			
			Properties prop = set.getProperties(set.firstGID);
			String propString = prop.getProperty(SOLID_PROP_KEY);
			
			if (Integer.parseInt(propString) == SOLID) {
				tile.setSolid(true);
				solidTiles.add(tile);
			}
			
			tiles.add(tile);
		}
	}
}
