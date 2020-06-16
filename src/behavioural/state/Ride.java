package behavioural.state;

public class Ride {
	RideState state = new BookNewRide();

	public void setState(RideState state) {
		this.state = state;
	}
	
	public void nextState() {
		state.next(this);
	}
	
	public void currentState() {
		state.printStatus();
	}
	
	

}
