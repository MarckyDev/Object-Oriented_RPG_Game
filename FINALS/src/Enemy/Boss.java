package Enemy;


public class Boss extends Enemy{


    //set names for boss
    String bb = "Blue Bird";
    protected int BossDefense, BossAttack, BossHealth;

    public Boss(){
        BossHealth = 100;
        BossAttack = 20;
        BossDefense = 15;
        super.enemyName = this.bb;
        super.enemyHealth = this.BossHealth;
        super.enemyAttack = this.BossAttack;
        super.enemyDefense = this.BossDefense;
    }

    @Override
    public String setEnemyName(String newEnemyName) {
        super.setEnemyName(newEnemyName);
        return newEnemyName;
    }
    @Override
    public void setEnemyDefense(int newEnemyDefense) {
        super.setEnemyDefense(BossDefense += newEnemyDefense);
    }
    @Override
    public void setEnemyAttack(int newEnemyAttack) {
        super.setEnemyAttack(BossAttack += newEnemyAttack);
    }
    @Override
    public int setEnemyHealth(int newEnemyHealth) {
        return super.setEnemyHealth(BossHealth += newEnemyHealth);
    }

    @Override
    public int getEnemyHealth() {
        return super.getEnemyHealth();
    }
    @Override
    public int getEnemyAttack() {
        return super.getEnemyAttack();
    }
    @Override
    public int getEnemyDefense() {
        return super.getEnemyDefense();
    }
    @Override
    public String getEnemyName() {
        return super.getEnemyName();
    }

    @Override
    public void fight(String enemyName){
        super.fight(enemyName);
    }

    @Override
    public void generate() {
        super.generate();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\nEnemy Stats: ");
        System.out.println("Health: " + getEnemyHealth());
        System.out.println("Attack: " + getEnemyAttack());
        System.out.println("Defense: " + getEnemyDefense());
    }
}
