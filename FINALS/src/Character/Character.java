package Character;

public abstract class Character {
    public String name;
    public int maxHealth, health, attack, defense;

    public Character(String name, int maxHealth, int attack, int defense){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }
    abstract int attack();
    abstract int defend();

}
