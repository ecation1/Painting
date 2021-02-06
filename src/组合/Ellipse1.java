package 组合;

import java.awt.Color;
import java.awt.Graphics;

import 基本图像.Draw;
import 基本图像.Ellipse;

public class Ellipse1 extends ComponentDecorator{

	public Ellipse1(Draw draw) {
		super(draw);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void draw(Graphics cs, int x, int y, int z, int w,Color color,float size) {
		Draw draw=new Ellipse();
		draw.draw(cs,x-50, y-50, z-50, w-50,color,size);
	}
}
