package behavioural.state;

public class BookNewRide implements RideState {

	@Override
	public void printStatus() {
		System.out.println("No ride scheduled. Book a new ride");

	}

	@Override
	public void next(Ride r) {
		r.setState(new Booked());
		
	}

	

}
