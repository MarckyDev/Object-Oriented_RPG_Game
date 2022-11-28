package Enemy;

import Battle.MainBattleSeq;
import Story.*;

public class Enemy implements EnemyGen{

    protected int enemyHealth;
    protected int enemyAttack;
    protected int enemyDefense;
    public String enemyName;

    public Enemy (){
        enemyName = null;
        enemyHealth = 0;
        enemyAttack = 0;
        enemyDefense = 0;
    }

    //Enemies on the fields route

    public int getEnemyHealth() {return enemyHealth;}
    public int getEnemyAttack() {return enemyAttack;}
    public String getEnemyName() {return enemyName;}
    public int getEnemyDefense() {return enemyDefense;}

    public int setEnemyHealth(int newEnemyHealth){
        return enemyHealth += newEnemyHealth;}
    public void setEnemyAttack(int newEnemyAttack) {
        enemyAttack += newEnemyAttack;}
    public String setEnemyName(String newEnemyName) {
        enemyName = newEnemyName;
        return newEnemyName;
    }
    public void setEnemyDefense(int newEnemyDefense){
        enemyDefense += newEnemyDefense;}


    @Override
    public void generate() {
        setEnemyName(enemyName);
        setEnemyDefense(enemyDefense);
        setEnemyAttack(enemyAttack);
        setEnemyHealth(enemyHealth);
    }

    @Override
    public void display() {
        System.out.println("\nEnemy Stats: ");
        System.out.println("Health: " + getEnemyHealth());
        System.out.println("Attack: " + getEnemyAttack());
        System.out.println("Defense: " + getEnemyDefense());
    }

    @Override
    public void fight(String enemyName) {
        generate();
        new StoryFunc().type("You Encountered: " + enemyName);
        if (new Story().BOSS >= 1) {
            new MainBattleSeq().mainSequence(enemyName, new Boss());
        } else if (new Story().NORMAL >= 1){
            new MainBattleSeq().mainSequence(enemyName, new EnemyProper());
        }
    }
}






