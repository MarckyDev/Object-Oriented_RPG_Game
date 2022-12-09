package Character;

public class Reese extends Character{

    public Reese() {
        super("Reese",
                100,
                0,
                0);
    }

    @Override
    public int attack() {
        return attack + (this.maxHealth/5) * 2 + 3;
    }

    @Override
    public int defend() {
        return defense + (this.maxHealth/8);
    }
}
