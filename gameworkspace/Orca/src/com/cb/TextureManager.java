package com.cb;

import java.io.IOException;


import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class TextureManager {
	Game game;
	Texture texture;
	int currentId;
	Map <Integer, Texture>textureSet;
	int id;
	Vector<Texture> texs;
	public TextureManager(Game g){
		game= g;
		currentId=1;
		texs= new Vector<Texture>();
		textureSet = new HashMap<Integer, Texture>();
	
	}
	
	public void addTexture(String path){
		try {
			texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(path));
			
				} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("err: IOException");
			}
				texs.add(texture);
			id = currentId;
			textureSet.put(currentId, texture);
			currentId++;
		
		
		
		
		
	}
	

	public void Draw(){
	
		
	/*
		for(int i = 0;i<texs.size();i++){
			
			texs.elementAt(i).bind();
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glTexCoord2f(0,0);
			GL11.glVertex2i(100+(100*i), 100+(100*i));
			GL11.glTexCoord2f(1,0);
			GL11.glVertex2i(200+(100*i), 100+(100*i));
			GL11.glTexCoord2f(1,1);
			GL11.glVertex2i(200+(100*i), 200+(100*i));
			GL11.glTexCoord2f(0,1);
			GL11.glVertex2i(100+(100*i), 200+(100*i));
		
			GL11.glEnd();	
		}
	*/
		
		
	}
	
}