
package entity;

public abstract class Character implements Fighter{
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int exp;
    private int gold;
    public Character(String name, int health, int strength, int dexterity, int exp, int gold) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.exp = exp;
        this.gold = gold;
    }
    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue()) return strength;
        else return  0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, health);
    }
}