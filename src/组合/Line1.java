package 组合;

import java.awt.Color;
import java.awt.Graphics;

import 基本图像.Draw;
import 基本图像.Line;

public class Line1 extends ComponentDecorator{

	public Line1(Draw draw) {
		super(draw);
		// TODO 自动生成的构造函数存根
	}
	public void draw(Graphics cs, int x, int y, int z, int w,Color color,float size) {
		// TODO 自动生成的方法存根
		Draw rec=new Line();
		rec.draw(cs, x-50, y-50, z-50, w-50,color,size);
	}
}
