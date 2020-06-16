package behavioural.state;

public class Booked implements RideState {

	@Override
	public void printStatus() {
		System.out.println("Ride booked");

	}

	@Override
	public void next(Ride r) {
		r.setState(new BookingConfirmed());
		
	}
}
