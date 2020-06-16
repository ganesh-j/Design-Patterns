package behavioural.observer;

public class CateringTrainObserver extends TrainObserver {

	@Override
	public void update() {
		System.out.println("Caterer is ready to serve by observing train notifiaction");

	}

}
