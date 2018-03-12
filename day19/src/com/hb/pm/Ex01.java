package com.hb.pm;

public class Ex01 {
	private int serial=123456789;

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Object obj=new Object();
//		Class cl1 = obj.getClass();
//		Ex01 me = new Ex01();
//		Class cl2 = me.getClass();
//		System.out.println(cl1.getCanonicalName());
//		System.out.println(cl1.getName());
//		System.out.println(cl2.getCanonicalName());
//		System.out.println(cl2.getName());
//		java.lang.Object
//		com.hb.pm.Ex01
		Class<Ex01> temp = (Class<Ex01>) Class.forName("com.hb.pm.Ex01");
		Ex01 obj=temp.newInstance();
		System.out.println(obj.serial);

	}
//	public String toString() {
//		return serial+"";
//	}
//	
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
////		return this.serial==((Ex01)obj).serial;
//		return this.hashCode()==obj.hashCode();
//	}
//	
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return this.serial;
//	}

}
