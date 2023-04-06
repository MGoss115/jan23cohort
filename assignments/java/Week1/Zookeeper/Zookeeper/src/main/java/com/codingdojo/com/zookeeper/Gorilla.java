package com.codingdojo.com.zookeeper;

public class Gorilla extends Mammal{
	
	private Mammal mammal;
	private String gorillaName;
	
	public Gorilla(String name, int energyLevel, String gorillaName) {
		super(name);
		this.energyLevel = energyLevel;
		this.gorillaName = gorillaName;
	}

	public String getGorillaName() {
		return gorillaName;
	}

	public void setGorillaName(String gorillaName) {
		this.gorillaName = gorillaName;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String getMammal() {
		return this.mammal.getName();
	}

	public void setMammal(String mammal) {
		this.mammal.setName(mammal);
	}

	public Gorilla(String name) {
		super(name);
	}

	public String throwSomething(Mammal mammal) {
		mammal.energyLevel -= 5;
		return "The Gorilla has thrown a chair and decreased your health to" + " " + mammal.energyLevel;
	}
	
	public String eatBananas() {
		this.energyLevel += 10;
		return "The gorilla is satisfied with the bananas and her energy has increased by 10. "
				+ "New energy level is " + " " + this.energyLevel;
	}
	
	public String climb() {
		this.energyLevel -= 10;
		return "The gorilla has climbed a tree and decreased it's energy by 10. Her current energy level is " 
				+ " " + this.energyLevel;
	}
	
	
}
