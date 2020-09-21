package com.luolala.ododp.singleton;

public class SingleObject {
	private static SingleObject instanceObject = new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstance() {
		return instanceObject;
	}
	
	public void showMessage() {
		System.out.println("Hi I'm the instance");
	}

}
