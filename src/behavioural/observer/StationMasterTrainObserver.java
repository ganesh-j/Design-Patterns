package behavioural.observer;

public class StationMasterTrainObserver extends TrainObserver {

	public void update() {
		System.out.println("Station master is doing his tasks on receiveing notification");
	}
}
