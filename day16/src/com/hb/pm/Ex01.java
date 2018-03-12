package com.hb.pm;

abstract class Pen{
	protected String color;
	
	Pen(String color){
		this.color=color;
	}
	
	public abstract void draw();
}

class Ballpen extends Pen{
	
	Ballpen(String color){
		super(color);
	}
	
	public void draw(){
		System.out.println(color+"색 진한 선을 긋다");
	}
}

class Pencil extends Pen{
	
	Pencil(String color){
		super(color);
	}
	
	public void draw(){
		System.out.println(color+"색 희미한 선을 긋다");
	}
}

class Box<T>{
	//제네릭 - T E K V
	T pen;
	
	public void push(T pen){
		this.pen=pen;
	}
	
	public T pull(){
		return pen;
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Box box = new Box();
//		Pencil pencil= new Pencil("검정");
//		box.push(pencil);
//		
//		Pen pencil2=(Pen)box.pull();
//		pencil2.draw();
		///////////////////////
		Box<Pen> box = new Box<Pen>();
		Ballpen ball=new Ballpen("빨강");
//		Pencil ball=new Pencil("검정");
		box.push(ball);
		
		Pen pen=box.pull();
		pen.draw();
		///////////////////////
	}

}













