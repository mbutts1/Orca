package com.cb;

import java.util.ArrayList;

public class Level {
	public Tile[] tiles;
	public ArrayList<GameObject> gameObjects;
	int width,height;
	
	public Level(int newWidth, int newHeight) // Constructor for an empty level
	{
		width = newWidth;
		height = newHeight;
		tiles = new Tile[width * height];
		for (int c = 0; c < tiles.length; c++)
		{
			tiles[c] = new Tile();
		}
		gameObjects = new ArrayList<GameObject>();
	}
}
