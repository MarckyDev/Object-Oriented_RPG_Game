package MC;
public class Reese {
    protected int Health;
    protected int Defense;
    protected int Attack;
    //default values of the mc stats
    public Reese(){
        Health = 10;
        Defense = 3;
        Attack = 1;
    }
    //getters to access the stats of the character
    public int getReeseHealth() {
        return Health;
    }
    public int getReeseDefense() {
        return Defense;
    }
    public int getReeseAttack() {
        return Attack;
    }

    //setters to set the values of the stats of the character
    public void setReeseHealth(int newReeseHealth){
        this.Health += newReeseHealth;
    }
    public void setReeseAttack(int newReeseAttack) {
        this.Attack += newReeseAttack;
    }
    public void setReeseDefense(int newReeseDefense) {
         this.Defense += newReeseDefense;
       }

}
