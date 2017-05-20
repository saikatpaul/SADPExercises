package com.sadp.designpattern.singleton;

public class LoggingTest {

	public static void main(String[] args) {
		Logger logger = ConsoleLogger.getInstance();
		logger.logInformation();
	}

}
