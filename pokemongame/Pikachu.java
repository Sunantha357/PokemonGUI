/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author asus
 */
public class Pikachu extends Pokemon implements Run{
	private static final int maxGroupHealth = 200;
	public Pikachu(){
		super("Picachu",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000)%100+50);

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

    /**
     *
     */
    @Override
	public void move(){
		this.run();
	}

        @Override
	public void run(){
		this.reducedWeight(10);
	}

        @Override
	public void walk(){
		this.reducedWeight(1);
	}
}
