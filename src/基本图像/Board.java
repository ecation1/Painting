package ����ͼ��;

import java.awt.Graphics;
public class Board {
	   public int n;
	   public int x[] = null;
	   public int y[] = null;
	   public void paintComponent(Graphics g) {//�����
	     g.drawPolygon(x, y, n);
	   }
	   public void paintComponent1(Graphics g){//������
	     g.drawOval(x[0], x[1], x[2], x[3]);
	   }
	   public void paintComponet2(Graphics g){//ֱ��
		   g.drawPolyline(x, y, n);
	   }
}
