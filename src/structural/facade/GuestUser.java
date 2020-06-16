package structural.facade;

public class GuestUser extends GenUser implements Guest {

	@Override
	public void guestInfo() {
		System.out.println("Stakeholders are  Reliance TATA and SBI");


	}
	
	@Override
	public void displayInfo() {
		generalInfo();
		guestInfo();
	}

}
