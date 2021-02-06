package »ù±¾Í¼Ïñ;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Triangle implements Draw{
	public void draw(Graphics cs, int x, int y, int z, int w,Color color, float size) {
		   float size1 = size;
		   ((Graphics2D)cs).setStroke(new BasicStroke(size1));
			  Board board = new Board();
			   board.n = 3;
			   board.x = new int[]{x, z, x-(z-x)};
			   board.y = new int[]{y, w, w};
			   cs.setColor(color);
			   board.paintComponent(cs);
		
	}

}
