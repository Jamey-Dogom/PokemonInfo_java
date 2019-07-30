package com.jd.pokemonproject;

public abstract class AbstractPokemon implements PokemonInterface {
	
	// Blueprint for other classes
	// Every method does not have to be used
	// Never instantiate from the abstract class
	
	String name;
	int health;
	String type;
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
	}
	
}