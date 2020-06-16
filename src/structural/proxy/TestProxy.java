package structural.proxy;

public class TestProxy {
	
	public static void main(String[] args) {
		
		Listener l = ListenerFactory.getListener("CEO");
		//passive do something
		l.listen(); //client active
		
		
		//passive
		
		l.listen();
		
	}

}
