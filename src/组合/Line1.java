package ���;

import java.awt.Color;
import java.awt.Graphics;

import ����ͼ��.Draw;
import ����ͼ��.Line;

public class Line1 extends ComponentDecorator{

	public Line1(Draw draw) {
		super(draw);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void draw(Graphics cs, int x, int y, int z, int w,Color color,float size) {
		// TODO �Զ����ɵķ������
		Draw rec=new Line();
		rec.draw(cs, x-50, y-50, z-50, w-50,color,size);
	}
}
