package structural.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		Drawing d = new Drawing();
		d.addGraphics(new Rectangle());
		d.addGraphics(new Circle());
		d.addGraphics(new Rectangle());
		d.draw("RED");
		
	}

}
