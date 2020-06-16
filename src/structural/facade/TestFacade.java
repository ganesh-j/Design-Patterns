package structural.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		Harman org = new Harman();
		User user = org.getUser("Admin");
		user.displayInfo();
		
		
	

}
}
