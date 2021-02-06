package 基本图像;

public class Factory {
public static Draw factory(String name){
	switch (name) {
	case "Line"://直线
		return new Line();
	case"triangle"://三角形
		return new Triangle();
	case "Ellipse"://椭圆
		return new Ellipse();
	case"Circle"://圆形
		return new Ellipse();
	case"Rectangle"://矩形
		return new Rectangle();
	case "null":break;
	}
	return null;
}
}
