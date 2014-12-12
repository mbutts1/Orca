package com.cb;

public abstract class GameObject {
	float x,y;
    boolean collisionEnabled;
	boolean physicsEnabled;
	
	public abstract void draw();
}
