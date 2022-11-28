package Enemy;


public class Boss extends Enemy{


    //set names for boss
    String bb = "Blue Bird";
    protected int BossDefense, BossAttack, BossHealth;

    public Boss(){
        BossHealth = 100;
        BossAttack = 20;
        BossDefense = 15;
        super.enemyName = bb;
        super.enemyHealth = BossHealth;
        super.enemyAttack = BossAttack;
        super.enemyDefense = BossDefense;
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
    }
}
