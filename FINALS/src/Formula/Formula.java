package Formula;

import Enemy.*;
import MC.Reese;

public class Formula{

    Reese reese = new Reese();
    public void dmg_to_enemy(int enemyDefense, int enemyHealth){
        int update_enemy_health = (reese.getReeseAttack() - enemyDefense) - enemyHealth;
        new Enemy().setEnemyHealth(update_enemy_health);
    }
    public void dmg_to_reese(int enemyAttack){
        int update_mc_health = (enemyAttack - reese.getReeseDefense()) - reese.getReeseHealth();
        reese.setReeseHealth(update_mc_health);
    }



}
