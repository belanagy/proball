package ants;

public abstract class Animal {
	
	private Direction direction;
	private Field field;
	
	public Animal(Direction dir, Field f){
		direction = dir;
		field = f;
	}
	
	public void move(){
		
	}
	
	public Field getField(){
		
		return null;
	}
	
	public void setField(Field field){
		
	}
	
	public Direction getDirection(){

		return null;
	}
	
	public void setDirection(Direction direction){
		
	}

}
