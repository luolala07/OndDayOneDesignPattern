package com.luolala.ododp.singleton;

public class SingleObjectRegister {
	
	//static internal class, lazy loading
	private static class SingleObjectHolder{
		private static final SingleObjectRegister INSTANCE = new SingleObjectRegister();
	}
	
	private SingleObjectRegister() {}
	
	public static final SingleObjectRegister getInstanceRegister() {
		return SingleObjectHolder.INSTANCE;
	}
	
	public void showMessage() {
		System.out.println("I'm the instance with Register Cluster");
	}

}
