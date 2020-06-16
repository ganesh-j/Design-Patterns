package creational.factorymethod;

public class Passenger extends Plane {
	
	Passenger(){

	}
	Passenger(int weight){
		super(weight);

	}

	public void takeOff() throws Exception {
		if(this.weight < 10000) {
			System.out.println("Pasenger TakeOff");
			fly();
		}
		else {
			throw new Exception(" Passenger plane can't takeoff due to heavy load");
			//System.out.println("PLane is overloaded. Can't takeOff");
		}
	}

}
