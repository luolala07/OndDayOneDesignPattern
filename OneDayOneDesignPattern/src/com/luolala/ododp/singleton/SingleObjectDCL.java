package com.luolala.ododp.singleton;

public class SingleObjectDCL {
	
	//how to use volatile?
	private volatile static SingleObjectDCL instanceObjectDCL;
	
	private SingleObjectDCL() {}
	
	public static SingleObjectDCL getInstanceObjectDCL() {
		if (instanceObjectDCL == null) {
			// how synchronized is used?
			synchronized (SingleObjectDCL.class) {
				if(instanceObjectDCL == null) {
					instanceObjectDCL = new SingleObjectDCL();
				}
			}
		}
		return instanceObjectDCL;
	}
	
	public void showMessage() {
		System.out.println("I'm the instance with Double Checked Locking");
	}

}
