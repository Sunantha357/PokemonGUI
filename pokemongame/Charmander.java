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
public class Charmander extends Pokemon implements Swimmable,Run {
    private static final int maxGroupHealth = 270;
    public Charmander(){
		super("Charmander",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000)%100+50);

		this.attackSkill = PokemonSkill.getPokemonSkill("Ember");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Flamethrower");
	}

	

    @Override
	public void swim(){
		this.reducedWeight(10);
	}
        
    @Override
        public void move(){
		this.swim();
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
