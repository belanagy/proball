package ants;

import java.util.Collection;

public class FoodStoreRoom extends Field {

	private Collection<Food> foods;
	
	public FoodStoreRoom(String id, Collection<Field> neighbourFields, Collection<Food> f){
		super(id, FieldType.FOODSTOREROOM, neighbourFields);
		foods = f;
	}
	
	public Food getFood(){
		
		return null;
	}
	
	public int foodCount(){

		return 0;
	}
		
}
