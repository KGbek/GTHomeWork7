package com.company.players;

import com.company.AbilityType;
import com.company.Hero;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.PHYSICAL_DAMAG);
    }

    @Override
    public void applySuperAbility(String supperAbilityType) {

    }
}
