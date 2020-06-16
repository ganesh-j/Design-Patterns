package structural.facade;

public class AdminUser extends GuestUser implements User, Admin {

	@Override
	public void adminInfo() {
		System.out.println("Admin information related stakeholders");

	}
	
	@Override
	public void displayInfo() {
		generalInfo();
		guestInfo();
		adminInfo();
		
	}

}
