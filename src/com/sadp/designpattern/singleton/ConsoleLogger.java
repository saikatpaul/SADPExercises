package com.sadp.designpattern.singleton;

public class ConsoleLogger implements Logger{
	
	private static ConsoleLogger instance;
	
	public static ConsoleLogger getInstance(){
		if(instance == null){
			instance = new ConsoleLogger();
		}
		return instance;
	}
		
	private ConsoleLogger() {}
	
	@Override
	public void logInformation() {
		System.out.println("Logging Information at console.");		
	}

}
