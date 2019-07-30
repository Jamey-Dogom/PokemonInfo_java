package com.jd.pokemonproject;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pX = new Pokedex();
		Pokemon squirtle = pX.createPokemon("Squirtle", 100, "Water");
		Pokemon charmander = pX.createPokemon("Charmander", 100, "Fire");
		Pokemon bulbasaur = pX.createPokemon("Bulbasaur", 100, "Grass");
		System.out.println(pX.pokemonInfo(squirtle));
		System.out.println(pX.pokemonInfo(charmander));
		System.out.println(pX.pokemonInfo(bulbasaur));
		pX.attackPokemon(squirtle);
		System.out.println(pX.pokemonInfo(squirtle));
		pX.attackPokemon(squirtle);
		System.out.println(pX.pokemonInfo(squirtle));
		System.out.println(squirtle.getName());

	}

}
