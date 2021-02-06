package ³·Ïú;

public class Coordinate{
	String name;
	int x,y,z,w;
	float size;
	public Coordinate(String name,int x,int y,int z,int w,float size){
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
	public Memento save(){
		return new Memento(name, x, y, z, w, size);
	}
	public void restore(Memento memento){
		this.name=memento.name;
		this.x=memento.x;
		this.y=memento.y;
		this.z=memento.z;
		this.w=memento.w;
		this.size=memento.size;
	}
}
