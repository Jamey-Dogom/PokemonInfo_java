package com.jd.pokemonproject;

public class Pokemon {
	
	private String name;
	private int health;
	private String type;
	
	// keeping track of all Pokemon created
	protected static int count = 0;

	// Constructor
	public Pokemon(String nameParam, int healthParam, String typeParam) {
		this.name = nameParam;
		this.health = healthParam;
		this.type = typeParam;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static int getCount() {
		return count;
	}
	
	
}
