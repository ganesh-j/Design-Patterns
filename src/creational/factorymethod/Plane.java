package creational.factorymethod;

public class Plane {
	
	int weight = 1000;
	
	public Plane() {
	}
	public Plane(int weight) {
		super();
		this.weight = weight;
	}
	
	public void start() {
		System.out.println("Starting");
	}
	public void fly() {
		System.out.println("Flying");
	}
	public void stop() {
		System.out.println("Stoped");
	}
	
	public void load(int weight) {
		System.out.println("Load method called with load "+ weight +"kgs");
		this.weight = this.weight + weight;
	}
	@Override
	public String toString() {
		return "Plane [weight=" + weight + "]";
	}
	public void takeOff() throws Exception {
		if(this.weight < 10000) {
			fly();
		}
		else {
			throw new Exception("Crash");
			//System.out.println("PLane is overloaded. Can't takeOff");
		}
	}
	//Factory Method design pattern - Constructional
	public static Plane getPlane(String str) {
		if(str.equals("Passenger")){
			return new Passenger(4999);
		}else if(str.equals("Cargo")){
			return new Cargo(4999);
		}else if(str.equals("Fighter")){
			return new Fighter(4999);
		}
		return new Plane();
	}
	

}
