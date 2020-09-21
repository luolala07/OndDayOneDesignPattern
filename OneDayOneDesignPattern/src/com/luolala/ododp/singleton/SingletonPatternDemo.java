package com.luolala.ododp.singleton;



public class SingletonPatternDemo {
	public static void main(String[] args) {
		//simple
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();
		
		//init not lazy loading
		SingleObjectInit singleObjectInit = SingleObjectInit.getInstanceInit();
		singleObjectInit.showMessage();
		
		//sync
		SingleObjectSync singleObjectSync = SingleObjectSync.getInstance();
		singleObjectSync.showMessage();
		
		//register class
		SingleObjectRegister singleObjectRegister = SingleObjectRegister.getInstanceRegister();
		singleObjectRegister.showMessage();
		
		// dcl
		SingleObjectDCL singleObjectDCL = SingleObjectDCL.getInstanceObjectDCL();
		singleObjectDCL.showMessage();
		
		//enum
		SinleObjectENUM testEnum = SinleObjectENUM.INSTANCE;
		testEnum.getInstanceENUM();
	}

}
