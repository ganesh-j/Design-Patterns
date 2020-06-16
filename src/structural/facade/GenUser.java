package structural.facade;

public class GenUser implements General {

	@Override
	public void generalInfo() {
		System.out.println("Harman in US,UK,INDIA");

	}

	@Override
	public void displayInfo() {
		generalInfo();

	}

}
