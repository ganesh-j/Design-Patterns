package structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		Window s = new Window("Register");
		WinListener l = new MyWinListener();
		s.addWinListener(l);
		s.windowclosing();
	}

}
