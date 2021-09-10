package com.company.players;

import com.company.AbilityType;
import com.company.Hero;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, AbilityType.MAGIC_DAMAG);
    }



    @Override
    public void applySuperAbility(String supperAbilityType) {

    }
}
