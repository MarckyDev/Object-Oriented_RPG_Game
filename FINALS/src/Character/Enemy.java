package Character;

public class Enemy extends Character{
    public Enemy(String name) {
        super(name,
                (int)(Math.random() * 5) + (10 * (50/5)),
                0,
                0);
    }

    @Override
    public int attack() {
        return  attack + this.maxHealth /4 + ((int)(Math.random() * 2)* 2);
    }

    @Override
    public int defend() {
        return (int)(Math.random() * 5);
    }
}






