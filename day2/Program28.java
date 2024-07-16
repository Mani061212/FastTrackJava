package com.day2;

public class Program28 {
      
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Program28() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}
}
