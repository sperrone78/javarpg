package com.sperrone.getorganized.models;

public class Toon extends Actor {
    private String charClass;
    private int currentExp;
    private int expToLevel;
    private int level;
    private int maxHealth;
    private int currentHealth;
    private int attackModifier;
    private int defModifier;

    public Toon(String startName, String startClass) {
        super(startName);
        level = 1;
        charClass = startClass;
        currentExp = 0;
        expToLevel = 10;
        maxHealth = 100;
        currentHealth = 100;
        attackModifier = 10;
        defModifier = 10;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getExpToLevel() {
        return expToLevel;
    }

    public void setExpToLevel(int expToLevel) {
        this.expToLevel = expToLevel;
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
