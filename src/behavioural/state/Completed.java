package behavioural.state;

public class Completed implements RideState {

	@Override
	public void printStatus() {
		System.out.println("Ride completed");
	}

	@Override
	public void next(Ride r) {
		r.setState(null);
	}

}
