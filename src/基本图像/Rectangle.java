package »ù±¾Í¼Ïñ;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Rectangle implements Draw{
	public void draw(Graphics cs, int x, int y, int z, int w, Color color,float size) {
		   float size1 = size;
		   ((Graphics2D)cs).setStroke(new BasicStroke(size1));
			int a[]={x,z,z,x};
			int b[]={y,y,w,w};
			Board board=new Board();
			board.n=4;
			board.x=a;
			board.y=b;
			cs.setColor(color);
			board.paintComponent(cs);
		
	}

}
