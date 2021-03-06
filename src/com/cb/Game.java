package com.cb;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL21;
import org.lwjgl.LWJGLException;

public class Game {
	
	private Level currentLevel;
	private Player player;
	
	public Game()
	{
		
	}
	
	public void setup()
	{
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		currentLevel = new Level(100,100); // 100x100 to start
		player = new Player(50 * 32.0f, 50 * 32.0f); // Center for testing
	}
	
	public void cleanup()
	{
		Display.destroy();
	}
	
	public void run()
	{
		setup();
		
		boolean running = true;
		while(running)
		{
			if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE) || Display.isCloseRequested())
			{
				running = false;
			}
			
			GL11.glClearColor(0.3f, 0.5f, 0.7f, 1.0f);
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			
			editTiles(); // Debug only
			
			Display.update();
			Display.sync(60);
		}
		
		cleanup();
	}
	
	public void editTiles()
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_UP))
		{
			int tileX = (int)Math.round(player.x);
			int tileY = (int)Math.round(player.y);
			currentLevel.tiles[(tileY * currentLevel.width) + tileX].tileID += 1;
		}

		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN))
		{
			int tileX = (int)Math.round(player.x);
			int tileY = (int)Math.round(player.y);
			currentLevel.tiles[(tileY * currentLevel.width) + tileX].tileID -= 1;
		}
	}
}
