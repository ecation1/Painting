package ����ͼ��;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Ellipse implements Draw{
	public void draw(Graphics cs, int x, int y, int z, int w, Color color,float size) {
		   float size1 = size;
		   ((Graphics2D)cs).setStroke(new BasicStroke(size1));
		   int a[]={x,y,z-x,w-y};
			// TODO �Զ����ɵķ������
			Board board=new Board();
			board.n=3;
			board.x=a;
			cs.setColor(color);
			board.paintComponent1(cs);
		
	}

}
