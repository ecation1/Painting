package ���;

import java.awt.Color;
import java.awt.Graphics;

import ����ͼ��.Draw;
import ����ͼ��.Ellipse;

public class Ellipse1 extends ComponentDecorator{

	public Ellipse1(Draw draw) {
		super(draw);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void draw(Graphics cs, int x, int y, int z, int w,Color color,float size) {
		Draw draw=new Ellipse();
		draw.draw(cs,x-50, y-50, z-50, w-50,color,size);
	}
}
