package creational.builder;

import java.util.HashMap;

public class Ride {
	
	HashMap<String, Item> hm = new HashMap<>();

	@Override
	public String toString() {
		return "Ride [hm=" + hm + "]";
	}
	
	public Category getCategory() {
		Item c =  hm.get("Mini Category");
		return (Category) c;
		
		
	}
	
	public String getDetails() {
		return "ride";
	}
	
	
	
	
	
			

}
