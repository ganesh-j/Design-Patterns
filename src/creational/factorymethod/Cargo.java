package creational.factorymethod;

public class Cargo extends Plane {
	Cargo(){

	}
	Cargo(int weight){
		super(weight);

	}

	public void takeOff() throws Exception {
		if(this.weight < 10000) {
			System.out.println("Cargo TakeOff");
			fly();
		}
		else {
			throw new Exception(" Cargo plane can't takeoff due to heavy load");
			//System.out.println("PLane is overloaded. Can't takeOff");
		}
	}

}
