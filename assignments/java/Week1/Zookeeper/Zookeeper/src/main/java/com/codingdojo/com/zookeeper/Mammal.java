package com.codingdojo.com.zookeeper;

public class Mammal {
	
	protected int energyLevel;
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public String displayEnergy() {
		return this.name + " " + "your current energy level is" + " " + energyLevel;
	}
	
	public Mammal(String name) {
		this.name = name;
	}
}
