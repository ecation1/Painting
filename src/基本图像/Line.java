package ����ͼ��;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Line implements Draw{
	public void draw(Graphics cs, int x, int y, int z, int w,Color color, float size) {
		   float size1 = size;
		   ((Graphics2D)cs).setStroke(new BasicStroke(size1));
		   Board board = new Board();
		   board.n = 2;
		   board.x = new int[]{x, z, x};
		   board.y = new int[]{y, w, w};
		   cs.setColor(color);
		   board.paintComponet2(cs);
		
	}

	
	/*public void draw(Graphics cs, int x, int y, int z, int w, int size) {
		// TODO �Զ����ɵķ������
		   float lineWidth = size;
		   ((Graphics2D)cs).setStroke(new BasicStroke(lineWidth));
		   Board board = new Board();
		   board.n = 3;
		   board.x = new int[]{x, z, x};
		   board.y = new int[]{y, w, w};
		   board.paintComponent(cs);
	}*/

	

}
