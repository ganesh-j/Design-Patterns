package behavioural.state;

public class TestState {

	public static void main(String[] args) {
		Ride r = new Ride();
		for(int i =0; i<5;i++) {
		r.currentState();
		r.nextState();
		}
	}

}
