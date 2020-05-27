package com.sperrone.getorganized.models;

public class Monster extends Actor{
    private int maxHealth;
    private int currentHealth;
    private String monsterType;
    private int attackModifier;
    private int defModifier;

    public Monster (String startName, String startMonsterType, int startCurrentHealth,
                    int startMaxHealth, int startAttackModifier, int startDefModifier)  {
        super(startName);
        setMaxHealth(startMaxHealth);
        setCurrentHealth(startCurrentHealth);
        setMonsterType(startMonsterType);
        setAttackModifier(startAttackModifier);
        setDefModifier(startDefModifier);
        super.setCurrentLocation("Forest");
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getDefModifier() {
        return defModifier;
    }

    public void setDefModifier(int defModifier) {
        this.defModifier = defModifier;
    }
}
