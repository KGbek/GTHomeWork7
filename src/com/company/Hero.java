package com.company;
import com.company.AbilityType;

public abstract class Hero implements IHavingSuperAbility {
    int health;
    int damage;

    private AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }
}
