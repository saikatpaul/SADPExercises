package com.sadp.designpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Logger instanceOne = ConsoleLogger.getInstance();
Logger instanceTwo = null;
	try{
Constructor[] constructors = ConsoleLogger.class.getDeclaredConstructors();
for (Constructor<?> constructor : constructors) {
//Below code will destroy the singleton pattern
constructor.setAccessible(true);
instanceTwo = (Logger) constructor.newInstance();
break;
}
} catch (Exception e) {
			e.printStackTrace();}
System.out.println(instanceOne.hashCode());
System.out.println(instanceTwo.hashCode());
}
}

