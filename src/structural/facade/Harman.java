package structural.facade;

public class Harman {
	
	public User getUser(String str) {
		if(str.equals("Guest")) {
			return new GuestUser();
		}else if(str.equals("Admin")) {
			return new AdminUser();
		}else if(str.equals("General")) {
			return new GenUser();
		}
		return null;
	}

}
