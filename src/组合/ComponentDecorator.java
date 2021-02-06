package 组合;

import java.awt.Color;
import java.awt.Graphics;

import 基本图像.Draw;

public class ComponentDecorator implements Draw{
	public ComponentDecorator(Draw draw) {
	}
	@Override
	public void draw(Graphics cs, int x, int y, int z, int w, Color color,float size) {}
}
