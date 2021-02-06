package ³·Ïú;

import java.util.ArrayList;

public class MementoCare {
//Memento memento;
public ArrayList<Memento> menlist=new ArrayList<Memento>();
public Memento getM(int i){
	return (Memento)menlist.get(i);
}
public void setMemento(Memento memento){
	menlist.add(memento);
}
public void setList(ArrayList<Memento> menlist){
	this.menlist=menlist;
}
}
