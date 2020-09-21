package com.luolala.ododp.singleton;

public class SingleObjectInit {
	
	//not lazy loading
	private static SingleObjectInit instanceObjectInit = new SingleObjectInit();
	
	private SingleObjectInit() {}
	
	public static SingleObjectInit getInstanceInit() {
		return instanceObjectInit;
	}
	
	public void showMessage() {
		System.out.println("I'm the instance without Lazy Loading");
	}
}
