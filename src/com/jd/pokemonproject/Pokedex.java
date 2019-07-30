package com.jd.pokemonproject;

public class Pokedex extends AbstractPokemon {
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + " Type: " + pokemon.getType() + " Health: " + pokemon.getHealth();
	}
}