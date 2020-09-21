package com.luolala.ododp.singleton;

public class SingleObjectSync {
	private static SingleObjectSync instanceObjectSync;
	
	private SingleObjectSync() {}
	
	public static synchronized SingleObjectSync getInstance() {
		if(instanceObjectSync == null) {
			instanceObjectSync = new SingleObjectSync();
		} 
		return instanceObjectSync;
	}
	
	public void showMessage() {
		System.out.println("I'm the instance with Sync Lock");
	}

}
