package ³·Ïú;

public class Memento {
	String name;
	int x,y,z,w;
	float size;
	public Memento(String name,int x,int y,int z,int w,float size){
		this.name=name;
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
		this.size=size;
	}
	public String getname(){
		return name;
	}
	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}
	public int getz(){
		return z;
	}
	public int getw(){
		return w;
	}
	public float getsize(){
		return size;
	}
}
