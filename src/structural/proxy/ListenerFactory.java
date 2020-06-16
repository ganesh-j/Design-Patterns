package structural.proxy;

public class ListenerFactory {

	public static Listener getListener(String string) {
		if(string.equals("CEO"))
			return new CEOProxy();
		return new Receptionist();
	}

}
