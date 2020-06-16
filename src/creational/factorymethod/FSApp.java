package creational.factorymethod;

public class FSApp {

	public static void main(String[] args) throws Exception {
		Plane p1 =Plane.getPlane(args[0]);
		
		p1.start();
		
		p1.stop();
		System.out.println("Initial state "+p1);
		p1.load(1000);
		
		System.out.println("Altered state "+p1);
		p1.takeOff();
		
		if(p1 instanceof Fighter)
			((Fighter) p1).launchMissile();
		
		//Fighter f1 = new Fighter(1000);
	}

}
