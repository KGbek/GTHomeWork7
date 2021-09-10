package com.company;

import com.company.players.Magic;
import com.company.players.Medic;
import com.company.players.Warrior;

public class Main {

    public static void main(String[] args) {
	    Hero heroes[] = new Hero[3];
        heroes[0] = new Medic(100,5);
        heroes[1] = new Magic(110,14);
        heroes[2] = new Warrior(120,10);

        for (Hero hero : heroes){
            System.out.println("Hero " + hero.getClass().getSimpleName() + " used: " + hero.getAbility());
        }
    }

}
