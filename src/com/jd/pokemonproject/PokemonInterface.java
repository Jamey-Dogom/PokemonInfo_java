package com.jd.pokemonproject;

public interface PokemonInterface {
	
	// Group of related methods with empty bodies
	// Cannot create an instance of the interface class
	// No constructor
	// Any fields will be static and final
	
	Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon pokemon);
	String pokemonInfo(Pokemon pokemon);

}
