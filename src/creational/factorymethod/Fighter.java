package creational.factorymethod;

public class Fighter extends Plane {
	
	Fighter(){
		
	}
	Fighter(int weight){
		super(weight);
		
	}
	
	public void takeOff() throws Exception {
		if(this.weight < 10000) {
			System.out.println("Fighter Takeoff");
			
			fly();
		}
		else {
			throw new Exception(" fighter can't takeoff due to heavy load");
			//System.out.println("PLane is overloaded. Can't takeOff");
		}
	}
	public void launchMissile() {
		System.out.println("Dropping missile");
	}


}
