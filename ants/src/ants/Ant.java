package ants;

import java.util.ArrayList;

public class Ant extends Animal {
	
	private Food food;
	private boolean isMoving;
	private ArrayList<Field> route;

	public Ant(Direction dir, Field f) {
		super(dir, f);
		isMoving = false;
		// TODO Auto-generated constructor stub
	}
	
	public Food getFood() {
		
		return null;
	}

	public void setFood(Food food) {

	}

	public boolean getisMoving() {

		return false;
	}

	public void setisMoving(boolean isMoving) {

	}
	
	public void setSmell(){
		
	}
			
	public void die(){
		
	}
	
	public void move(){
		
	}	
	
	

}
