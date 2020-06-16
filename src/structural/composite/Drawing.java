package structural.composite;

import java.util.ArrayList;

public class Drawing implements Graphics {
	
	ArrayList<Graphics> shapes = new ArrayList<>();
	@Override
	public void draw(String color) {
		for(Graphics g : shapes) {
			g.draw(color);
		}
	}
	public void addGraphics(Graphics g) {
			shapes.add(g);
	}
	
	

}
