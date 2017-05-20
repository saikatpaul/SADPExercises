package com.sadp.designpattern.factory;

public class RoomFactoryClient {
	public static void main(String[] args) {
		Factory factory = null;//new FactoryImpl();
		
		RoomFactory roomFactory = factory.createRoomFactory();
		roomFactory.createDoor();
		roomFactory.createFloor();
		

	}
	
}
