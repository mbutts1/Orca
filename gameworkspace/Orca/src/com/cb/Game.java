package com.cb;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL21;
import org.lwjgl.LWJGLException;

public class Game {
	
	public Game()
	{
		
	}
	
	public void setup()
	{
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
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
			
			GL11.glClearColor(0.3f, 0.3f, 0.7f, 1.0f);
			GL11.glClear(0);
			
			Display.update();
			Display.sync(60);
		}
		
		cleanup();
	}
}