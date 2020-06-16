package behavioural.observer;

public class TestObserver {

	public static void main(String[] args) {
		Train t = new Train();
		t.attach(new StationMasterTrainObserver());
		t.attach(new CateringTrainObserver());
		t.setOnTime(true);
		
	}

}
