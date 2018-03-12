package com.hb.pm;

class Tico{
	void name(){
		System.out.println("Tico");
	}
}
class Sonata{
	void name(){
		System.out.println("Sonata");
	}
	
}
class Sm5{
	void name(){
		System.out.println("Sm5");
	}
	
}
class K3{
	void name(){
		System.out.println("K3");
	}
	
}

class Factory<T>{
	T car;
	
	void set(T car){
		this.car=car;
	}
	
	T get(){
		return car;
	}
}

class Template{
	static <T>Factory<T> getInst(T car){
		Factory<T> fac= new Factory<T>();
		fac.set(car);
		return fac;
	}
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		Factory<Tico> f = Template.<Tico>getInst(new Tico());
		Tico car = f.get();
		car.name();
	}

}
