package behavioural.observer;

import java.util.ArrayList;

public class Train {
	boolean isOnTime = false;
	ArrayList<TrainObserver> observer = new ArrayList<>();
	


	public void setOnTime(boolean isOnTime) {
		this.isOnTime = isOnTime;
		notifyAllObservers();
	}



	private void notifyAllObservers() {
		for(TrainObserver to : observer) {
			to.update();
		}

		
	}



	public void attach(TrainObserver to) {
		observer.add(to);
		
	}

}
