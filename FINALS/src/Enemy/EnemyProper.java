package Enemy;

import java.util.Random;

public class EnemyProper extends Enemy{
    public final String[] enemies = {"Ant", "Moth", "Beetle", "Mite", "Bird"};
    protected int enemyDefense, enemyAttack, enemyHealth;

    public EnemyProper(){
        this.enemyHealth = 10;
        this.enemyAttack = 2;
        this.enemyDefense = 1;
        super.enemyName = enemies[new Random().nextInt(enemies.length)];
        super.enemyDefense = this.enemyDefense;
        super.enemyAttack = this.enemyAttack;
        super.enemyHealth = this.enemyHealth;
    }
    @Override
    public String setEnemyName(String newEnemyName) {
        super.setEnemyName(newEnemyName);
        return newEnemyName;
    }

    @Override
    public void setEnemyDefense(int newEnemyDefense) {
        super.setEnemyDefense(enemyDefense += newEnemyDefense);
    }

    @Override
    public void setEnemyAttack(int newEnemyAttack) {
        super.setEnemyAttack(enemyAttack += newEnemyAttack);
    }

    @Override
    public int setEnemyHealth(int newEnemyHealth) {
        return super.setEnemyHealth(enemyHealth += newEnemyHealth);
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
        super.setEnemyName(setEnemyName(enemies[new Random().nextInt(enemies.length)]));
        super.setEnemyHealth(10);
        super.setEnemyAttack(5);
        super.setEnemyDefense(0);
    }

    @Override
    public void display() {
        super.display();
    }
}
