package com.sadp.designpattern.singleton;

public class SingletonEnumDemo {
public static void main(String[] args) {
	SingletonEnum instance1 = SingletonEnum.INSTANCE;
	SingletonEnum instance2 = SingletonEnum.INSTANCE;
	System.out.println(instance1 == instance2);
}
}
