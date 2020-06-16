package behavioural.state;

public class BookingConfirmed implements RideState {

	@Override
	public void printStatus() {
		System.out.println("Booking confirmed. Get in");

	}

	@Override
	public void next(Ride r) {
		r.setState(new OnGoing());

	}

}
