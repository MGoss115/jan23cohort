package com.codingdojo.com.zookeeper;

public class Bat extends Mammal{

	public Bat(String name) {
		super(name);
		this.energyLevel = 300;
	}
	
	public String fly() {
		this.energyLevel -= 50;
		return "Sound of bat taking off. Bat is flying around town and his energy has decreased by 50 Current energy level is " 
				+ " " + this.energyLevel;
	}
	
	public String eatHuman() {
		this.energyLevel += 25;
		return "so- well, never mind, just increase its energy by 25." + " " + this.energyLevel;
	}
	
	public String attackTown() {
		this.energyLevel -= 100;
		return "Sound of a town on fire! The bat is attacking! It's energy has decreased by 100."
				+ " " + this.energyLevel;
	}
	
}
