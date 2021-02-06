package 绘图;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

import 修饰.ChooseSize;
import 修饰.Size;
import 基本图像.Draw;
import 基本图像.Ellipse;
import 基本图像.Factory;
import 基本图像.Line;
import 基本图像.Rectangle;
import 基本图像.Triangle;
import 撤销.Coordinate;
import 撤销.MementoCare;
import 组合.Ellipse1;
import 组合.Line1;
import 组合.Rectangle1;
import 组合.Triangle1;

import java.awt.Panel;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Window {
	private JFrame frame;
	int x=0;
	int y=0;
	int z=0;
	int w=0;
	int index=-1;
	String name="null";
	String Com_name;
	int flag=0;
	int flag2=0;
	float size=1.0f;//字体变量
	Draw com,com2;
	ChooseSize Csize;
	Color color=Color.BLACK;//颜色变量
	Color color1=Color.WHITE;
	Graphics cs;
	MementoCare mc=new MementoCare();
	Coordinate coor;
//	BufferedImage targetImg=new BufferedImage(400,400,BufferedImage.TYPE_INT_RGB);
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1276, 756);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
												//显示坐标
												textField = new JTextField();
												textField.setBounds(14, 77, 199, 45);
									
												textField.setColumns(10);
												//菜单窗口
												//图像选择窗口
												Panel panel = new Panel();
												panel.setBackground(Color.YELLOW);
												panel.setBounds(46, 35, 376, 147);
												frame.getContentPane().add(panel);
												panel.setLayout(null);
												//修饰选择窗口
												Panel panel_1 = new Panel();
												panel_1.setBackground(Color.PINK);
												panel_1.setBounds(456, 35, 360, 147);
												frame.getContentPane().add(panel_1);
												panel_1.setLayout(null);
												

												//其他选择窗口
												Panel panel_2 = new Panel();
												panel_2.setBackground(Color.PINK);
												panel_2.setBounds(862, 35, 360, 147);
												frame.getContentPane().add(panel_2);

												//提示
												JLabel label = new JLabel("图像选择");
												label.setFont(new Font("方正姚体", Font.BOLD, 20));
												label.setOpaque(true);
												label.setBackground(Color.WHITE);
												label.setBounds(182, 13, 90, 23);
												frame.getContentPane().add(label);
												
												JLabel lblNewLabel = new JLabel("装饰");
												lblNewLabel.setFont(new Font("方正姚体", Font.BOLD, 22));
												lblNewLabel.setOpaque(true);
												lblNewLabel.setBackground(Color.WHITE);
												lblNewLabel.setBounds(592, 14, 65, 21);
												frame.getContentPane().add(lblNewLabel);
												
												JLabel lblNewLabel_3 = new JLabel("其他");
												lblNewLabel_3.setFont(new Font("方正姚体", Font.BOLD, 22));
												lblNewLabel_3.setOpaque(true);
												lblNewLabel_3.setBackground(Color.WHITE);
												lblNewLabel_3.setBounds(1019, 14, 53, 21);
												frame.getContentPane().add(lblNewLabel_3);
												
												//画板
												JPanel panel_3 = new JPanel();
												panel_3.setBackground(Color.white);
												panel_3.setBounds(14, 188, 1230, 521);
												frame.getContentPane().add(panel_3);
												panel_3.setLayout(null);
												panel_3.addMouseListener(new MouseListener() {
													public void mouseReleased(MouseEvent e) {
														// TODO 自动生成的方法存根
														z=e.getX();
														w=e.getY();
														cs=panel_3.getGraphics();
//														Graphics2D g2d=(Graphics2D) cs;
//														g2d=targetImg.createGraphics();
														switch (flag) {
														case 0:
															Draw draw=Factory.factory(name);
															draw.draw(cs, x, y, z, w,color,size);
//															System.out.println(x+" "+y);
															coor=new Coordinate(name, x, y, z, w, size);
															mc.setMemento(coor.save());
//															g2d.copyArea(0, 0, 1200, 500,1, 1);
//															 try {
//																ImageIO.write(targetImg, "PNG", new File("c:\\yourImageName.PNG"));
//															} catch (IOException e1) {
//																// TODO 自动生成的 catch 块
//																e1.printStackTrace();
//															}
															//System.out.println(coor.getsize());
//															System.out.println("size:"+coor.getsize());
//															System.out.println("index"+index);
															index++;
															break;
														case 1:
																com=new Rectangle();
																com.draw(cs, x, y, z, w,color,size);
																switch (flag2) {
																case 1:
																	com2=new Rectangle1(com);
																	break;
																case 2:
																	com2=new Triangle1(com);
																	break;
																case 3:
																	com2=new Ellipse1(com);
																	break;
																case 4:
																	com2=new Line1(com);
																	break;
																}
																com2.draw(cs, x, y, z, w,color,size);
																break;
														case 2:
																com=new Triangle();
																com.draw(cs, x, y, z, w,color,size);
																switch (flag2) {
																case 1:
																	com2=new Rectangle1(com);
																	break;
																case 2:
																	com2=new Triangle1(com);
																	break;
																case 3:
																	com2=new Ellipse1(com);
																	break;
																case 4:
																	com2=new Line1(com);
																	break;
																}
																com2.draw(cs, x, y, z, w,color,size);
																break;
														case 3:
															com=new Ellipse();
															com.draw(cs, x, y, z, w,color,size);
															switch (flag2) {
															case 1:
																com2=new Rectangle1(com);
																break;
															case 2:
																com2=new Triangle1(com);
																break;
															case 3:
																com2=new Ellipse1(com);
																break;
															case 4:
																com2=new Line1(com);
																break;
															}
															com2.draw(cs, x, y, z, w,color,size);
															break;
														case 4:
															com=new Line();
															com.draw(cs, x, y, z, w,color,size);
															switch (flag2) {
															case 1:
																com2=new Rectangle1(com);
																break;
															case 2:
																com2=new Triangle1(com);
																break;
															case 3:
																com2=new Ellipse1(com);
																break;
															case 4:
																com2=new Line1(com);
																break;
															}
															com2.draw(cs, x, y, z, w,color,size);
															break;
														case 5:
															Csize=new Size(size);
															Draw draw1=Factory.factory(name);
															draw1.draw(cs, x, y, z, w, color,Csize.getSize());
															coor=new Coordinate(name, x, y, z, w, size);
															mc.setMemento(coor.save());
															index++;
															break;
														case 6:

														break;
													}
													}
													@Override
													public void mousePressed(MouseEvent e) {
														// TODO 自动生成的方法存根
														x=e.getX();
														y=e.getY();	
													}
													@Override
													public void mouseClicked(MouseEvent e) {
	
													}
													public void mouseEntered(MouseEvent e) {
													}
													public void mouseExited(MouseEvent e) {
													}

												});
												//坐标显示
												panel_3.addMouseMotionListener(new MouseMotionListener() {
													
													@Override
													public void mouseMoved(MouseEvent e) {
														int x=e.getX();
														int y=e.getY();
														String place="x:"+x+",y:"+y;
														textField.setFont(new Font("宋体",Font.BOLD,20));
														textField.setText(place);
													}
													
													@Override
													public void mouseDragged(MouseEvent e) {
													}
												});
																				//图像按钮
																				JButton btnNewButton_3 = new JButton("矩形");
																				btnNewButton_3.setBounds(14, 25, 76, 27);
																				panel.add(btnNewButton_3);
																				btnNewButton_3.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent arg0) {
																						name="Rectangle";
																					}
																				});
																		
																				JButton btnNewButton_1 = new JButton("三角形");
																				btnNewButton_1.setBounds(128, 25, 97, 27);
																				panel.add(btnNewButton_1);
																				btnNewButton_1.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent arg0) {
																						name="triangle";
																					}
																				});
																		
																		JButton btnNewButton_2 = new JButton("圆形");
																		btnNewButton_2.setBounds(14, 106, 76, 27);
																		panel.add(btnNewButton_2);
																		btnNewButton_2.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				name="Ellipse";
																				
																			}
																		});
																
																		JButton btnNewButton = new JButton("直线");
																		btnNewButton.setBounds(128, 106, 97, 27);
																		panel.add(btnNewButton);
																		btnNewButton.addActionListener(new ActionListener() {
																			
																			@Override
																			public void actionPerformed(ActionEvent e) {
																			name="Line";
																				
																			}
																		});
																		
																		JButton btnNewButton_4 = new JButton("椭圆");
																		btnNewButton_4.setBounds(249, 25, 113, 27);
																		panel.add(btnNewButton_4);
																		btnNewButton_4.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				name="Ellipse";
																				
																			}
																		});
																		
																		
																		
																		
																		
																		//装饰图像按钮
																		JButton btnNewButton_6 = new JButton("矩形");
																		btnNewButton_6.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent arg0) {
																				Com_name="Rectangle";
																				flag=1;
																				switch (name) {
																				case "Rectangle":
																					flag2=1;
																					break;
																				case "triangle":
																					flag2=2;
																					break;
																				case "Ellipse":
																					flag2=3;
																					break;
																				case "Line":
																					flag2=4;
																					break;
																				}
																			}
																		});
																		btnNewButton_6.setBounds(14, 23, 90, 27);
																		panel_1.add(btnNewButton_6);
																		
																		JButton btnNewButton_7 = new JButton("三角形");
																		btnNewButton_7.setBounds(131, 23, 90, 27);
																		panel_1.add(btnNewButton_7);
																		btnNewButton_7.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				// TODO 自动生成的方法存根
																				Com_name="Triangle";
																				flag=2;
																				switch (name) {
																				case "Rectangle":
																					flag2=1;
																					break;
																				case "triangle":
																					flag2=2;
																					break;
																				case "Ellipse":
																					flag2=3;
																					break;
																				case "Line":
																					flag2=4;
																					break;
																			}
																			}
																		});
																		JButton btnNewButton_8 = new JButton("椭圆");
																		btnNewButton_8.setBounds(249, 23, 97, 27);
																		panel_1.add(btnNewButton_8);
																		btnNewButton_8.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				// TODO 自动生成的方法存根
																				Com_name="Ellipse";
																				flag=3;
																				switch (name) {
																				case "Rectangle":
																					flag2=1;
																					break;
																				case "triangle":
																					flag2=2;
																					break;
																				case "Ellipse":
																					flag2=3;
																					break;
																				case "Line":
																					flag2=4;
																					break;
																			}
																			}
																		});
																		JButton btnNewButton_9 = new JButton("圆形");
																		btnNewButton_9.setBounds(14, 107, 97, 27);
																		panel_1.add(btnNewButton_9);
																		btnNewButton_9.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				Com_name="Ellipse";
																				flag=3;
																				switch (name) {
																				case "Rectangle":
																					flag2=1;
																					break;
																				case "triangle":
																					flag2=2;
																					break;
																				case "Ellipse":
																					flag2=3;
																					break;
																				case "Line":
																					flag2=4;
																					break;
																			}	
																			}
																		});
																		JButton btnNewButton_10 = new JButton("直线");
																		btnNewButton_10.setBounds(131, 107, 90, 27);
																		panel_1.add(btnNewButton_10);
																		btnNewButton_10.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				Com_name="Line";
																				flag=4;
																				switch (name) {
																				case "Rectangle":
																					flag2=1;
																					break;
																				case "triangle":
																					flag2=2;
																					break;
																				case "Ellipse":
																					flag2=3;
																					break;
																				case "Line":
																					flag2=4;
																					break;
																			}	
																			}
																		});
																		panel_2.setLayout(null);
																		//其他按钮
																		JButton btnNewButton_11 = new JButton("颜色");
																		btnNewButton_11.setBounds(14, 27, 97, 27);
																		panel_2.add(btnNewButton_11);
																		btnNewButton_11.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent arg0) {
																			color=JColorChooser.showDialog(panel_2, "选择颜色", color);
																			System.out.println(color);
																			flag=5;
																			}
																		});
																		//字体粗细选择
//																		float font[]={1,2,3,4};
																		JComboBox<Float> comboBox = new JComboBox<Float>();
																		comboBox.setBounds(125, 28, 88, 24);
																		panel_2.add(comboBox);
																		comboBox.addItem(1.0f);
																		comboBox.addItem(3.0f);
																		comboBox.addItem(5.0f);
																		comboBox.addItem(7.0f);
																		comboBox.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				flag=5;
																				size=Float.parseFloat((comboBox.getSelectedItem().toString().trim()));
																				System.out.println(size);
																			}
																		});
																		JButton btnNewButton_12 = new JButton("撤销");
																		btnNewButton_12.setBounds(227, 86, 88, 27);
																		panel_2.add(btnNewButton_12);
																		btnNewButton_12.addActionListener(new ActionListener() {
																			
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO 自动生成的方法存根
																				//flag=6;
																				coor.restore(mc.getM(index));
																				Draw draw2=Factory.factory(coor.getname());
																				draw2.draw(cs, coor.getx(), coor.gety(), coor.getz(), coor.getw(),color1,coor.getsize());
																				index--;
																			}
																		});
																		panel_2.add(textField);
																		
																		JButton btnNewButton_13 = new JButton("重置");
																		btnNewButton_13.setBounds(227, 27, 88, 27);
																		panel_2.add(btnNewButton_13);
																		
//																		JButton btnNewButton_14 = new JButton("保存");
//																		btnNewButton_14.setBounds(273, 86, 73, 27);
//																		panel_2.add(btnNewButton_14);
//																		btnNewButton_14.addActionListener(new ActionListener() {
//																			public void actionPerformed(ActionEvent arg0) {
//																				flag=6;
//																				
//																			}
//																		});
																		btnNewButton_13.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																			     flag=0;
																			     flag2=0;
																			     name=null;
																			     index=-1;
																			     mc.menlist.clear();
																			}
																		});
																	
																		//清空按钮
																		JButton btnNewButton_5 = new JButton("清空");
																		btnNewButton_5.setBounds(1117, 0, 113, 27);
																		panel_3.add(btnNewButton_5);
																		btnNewButton_5.addActionListener(new ActionListener(){
																			public void actionPerformed(ActionEvent e) {
																			     panel_3.removeAll();
																			     panel_3.add(btnNewButton_5);
																			     panel_3.update(panel_3.getGraphics());

																			}
																		});
																		

																		

																		

																		



	}
}
