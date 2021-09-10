package com.company.players;

import com.company.AbilityType;
import com.company.Hero;

public class Medic extends Hero {

    public Medic(int health, int damage) {
        super(health, damage, AbilityType.HEAL);
    }

    @Override
    public void applySuperAbility(String supperAbilityType) {

    }
}
