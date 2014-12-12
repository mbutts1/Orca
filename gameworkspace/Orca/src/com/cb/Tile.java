package com.cb;

public class Tile extends GameObject {
    int tileID; // ID of the tile, which is expressed in a tile map
    float layer; // Depth of the tile
    
    public Tile()
    {
    	tileID = 0;
    	layer = 0.0f;
    }
	
	public void draw()
	{
		
	}
}
