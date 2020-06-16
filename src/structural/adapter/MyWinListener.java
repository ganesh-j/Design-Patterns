package structural.adapter;

public class MyWinListener extends WinAdapter {
	public void windowClosing(WindowEvent we) {
		String name =we.getName();
		System.out.println(name + "closed");
		
	}
}
