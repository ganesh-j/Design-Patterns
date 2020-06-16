package structural.decorator;

public class Car {
	boolean isWashed = false;
	boolean isRegistered = false;
	boolean isDelivered = false;
	boolean isAccesoriesFitted = false;
	@Override
	public String toString() {
		return "Car [isWashed=" + isWashed + ", isRegistered=" + isRegistered + ", isDelivered=" + isDelivered
				+ ", isAccesoriesFitted=" + isAccesoriesFitted + "]";
	}
	
	
	

}
