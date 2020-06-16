package behavioural.state;

public class OnGoing implements RideState {

	@Override
	public void printStatus() {
		System.out.println("Ride in progress. enjoy the music");
	}

	@Override
	public void next(Ride r) {
		r.setState(new Completed());

	}

}
