package ����ͼ��;

public class Factory {
public static Draw factory(String name){
	switch (name) {
	case "Line"://ֱ��
		return new Line();
	case"triangle"://������
		return new Triangle();
	case "Ellipse"://��Բ
		return new Ellipse();
	case"Circle"://Բ��
		return new Ellipse();
	case"Rectangle"://����
		return new Rectangle();
	case "null":break;
	}
	return null;
}
}
